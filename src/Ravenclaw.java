public class Ravenclaw extends Hogwarts {
    private int clever;
    private int bluMagic;

    public Ravenclaw(String name, int age, int magic, int clever, int bluMagic) {
        super(name, age, magic);
        this.clever = clever;
        this.bluMagic = bluMagic;
    }


    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getBluMagic() {
        return bluMagic;
    }

    public void setBluMagic(int bluMagic) {
        this.bluMagic = bluMagic;
    }

    public void ravenclawVersus(Ravenclaw another) {
        if (this.clever + this.bluMagic > another.getClever() + another.getBluMagic()) {
            System.out.format("%s is stronger than %s\n", this.getName(), another.getName());
        } else if (this.clever + this.bluMagic < another.getClever() + another.getBluMagic()) {
            System.out.format("%s is stronger than %s\n", another.getName(), this.getName());
        } else {
            System.out.println("Their power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Ravenclaw\nage: %s\nMagic Power: %s\nclever Power: %s\nBlu Magic: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getClever(), this.getBluMagic());
    }
}
