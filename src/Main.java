public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Bill", "Kurisy");
        Author author2 = new Author("Mage", "Lasny");

        Book book1 = new Book("horror", author1, 2018);
        Book book2 = new Book("comedy", author2, 2012);

        book1.setYearPublished(2016);

        System.out.format("%s, %s, %s\n", book1.getTitle(), book1.getAuthor().getFirstName(), book1.getYearPublished());
        System.out.format("%s, %s, %s\n", book2.getTitle(), book2.getAuthor().getFirstName(), book2.getYearPublished());
    }
}
