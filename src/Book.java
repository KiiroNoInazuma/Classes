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

}

