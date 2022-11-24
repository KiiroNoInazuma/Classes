public class Library {
    public static void main(String[] args) {
        Author author = new Author("Den", "Brown");
        Author author1 = new Author("Den", "Brown");
        Book book = new Book("Symbol", author, 2012);
        Book bookFirst = new Book("Symbol", author1, 2020);
        book.setPublicYear(2020);
        System.out.println(author.getName());
        System.out.println(author.getSurname());
        System.out.println(book.getNameBook());
        System.out.println(book.getPublicYear());
        System.out.println(book);
        System.out.println(book.equals(bookFirst));

    }
}
