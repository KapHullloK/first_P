public class Car extends Transport {


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check(Transport transport) {
        super.check(transport);
        checkEngine();
    }

}