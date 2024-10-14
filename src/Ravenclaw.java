public class Ravenclaw extends Hogwarts {
    private int clever;

    public Ravenclaw(String name, int age, int magic, int clever) {
        super(name, age, magic);
        this.clever = clever;
    }


    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public void cleverVersus(Ravenclaw another) {
        if (this.clever > another.getClever()) {
            System.out.format("%s's clever is stronger than %s's\n", this.getName(), another.getName());
        } else if (this.clever < another.getClever()) {
            System.out.format("%s's clever is stronger than %s's\n", another.getName(), this.getName());
        } else {
            System.out.println("Their clever power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Ravenclaw\nage: %s\nMagic Power: %s\nclever Power: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getClever());
    }
}
