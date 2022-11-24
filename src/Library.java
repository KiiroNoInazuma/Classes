public class Library {
    public static void main(String[] args) {
        Author author = new Author("Den", "Brown");
        Book book = new Book("Symbol", author, 2012);
        book.setPublicYear(2020);
        System.out.println(author.getName());
        System.out.println(author.getSurname());
        System.out.println(book.getNameBook());
        System.out.println(book.getPublicYear());
    }
}
