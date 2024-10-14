public class Hufflepuff extends Hogwarts {
    private int tenacity;

    public Hufflepuff(String name, int age, int magic, int tenacity) {
        super(name, age, magic);
        this.tenacity = tenacity;
    }


    public int getTenacity() {
        return tenacity;
    }

    public void setTenacity(int tenacity) {
        this.tenacity = tenacity;
    }


    public void tenacityVersus(Hufflepuff another) {
        if (this.tenacity > another.getTenacity()) {
            System.out.format("%s's tenacity is stronger than %s's\n", this.getName(), another.getName());
        } else if (this.tenacity < another.getTenacity()) {
            System.out.format("%s's tenacity is stronger than %s's\n", another.getName(), this.getName());
        } else {
            System.out.println("Their tenacity power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Hufflepuff\nage: %s\nMagic Power: %s\ntenacity Power: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getTenacity());
    }
}
