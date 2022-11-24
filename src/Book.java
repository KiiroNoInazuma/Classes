import java.util.Objects;

public class Book {
    private String nameBook;
    private Author nameAuthor;
    private int publicYear;

    Book(String nameBook, Author nameAuthor, int publicYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publicYear = publicYear;
    }

    String getNameBook() {
        return nameBook;
    }

    Author getNameAuthor() {
        return nameAuthor;
    }

    int getPublicYear() {
        return publicYear;
    }

    void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    @Override
    public String toString() {
        return nameBook + " " + nameAuthor + " " + publicYear;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return nameBook.equals(book.nameBook) && nameAuthor.equals(book.nameAuthor) && publicYear == book.publicYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, nameAuthor, publicYear);
    }
}

