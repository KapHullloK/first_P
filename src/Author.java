public class Author {
    private String firstName;
    private String secondName;


    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, secondName);
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || other == null) {
            return false;
        }
        Author otherAuthor = (Author) other;
        return this.firstName.equals(otherAuthor.firstName) && this.secondName.equals(otherAuthor.secondName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
    }
}
