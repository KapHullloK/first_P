public class Truck extends Car {
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check(Transport transport) {
        super.check(transport);
        checkTrailer();
    }
}