import static java.util.Objects.hash;

public class Author {
    private String name;
    private String surname;

    Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        Author author = (Author) obj;
        return name.equals(author.name) && surname.equals(surname);
    }

    @Override
    public int hashCode() {
        return hash(name, surname);
    }
}
