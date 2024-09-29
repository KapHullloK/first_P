

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Bill", "Kurisy");
        Author author2 = new Author("Mage", "Lasny");
        Author author3 = new Author("Bill", "Kurisy");

        Book book1 = new Book("horror", author1, 2018);
        Book book2 = new Book("comedy", author2, 2012);
        Book book3 = new Book("horror", author1, 2016);


        book1.setYearPublished(2016);

        System.out.format("%s\n", book1);
        System.out.println("-----------");
        System.out.format("%s\n", book2);
        System.out.println("-----------");
        System.out.println(author1.equals(author2));
        System.out.println(author1.equals(author3));
        System.out.println("-----------");
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

    }
}
