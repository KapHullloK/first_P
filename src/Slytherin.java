public class Slytherin extends Hogwarts {
    private int sly;
    private int redMagic;

    public Slytherin(String name, int age, int magic, int sly, int redMagic) {
        super(name, age, magic);
        this.sly = sly;
        this.redMagic = redMagic;
    }


    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        this.sly = sly;
    }

    public int getRedMagic() {
        return redMagic;
    }

    public void setRedMagic(int redMagic) {
        this.redMagic = redMagic;
    }

    public void slytherinVersus(Slytherin another) {
        if (this.sly + this.redMagic > another.getSly() + another.getRedMagic()) {
            System.out.format("%s is stronger than %s\n", this.getName(), another.getName());
        } else if (this.sly + this.redMagic < another.getSly() + another.getRedMagic()) {
            System.out.format("%s is stronger than %s\n", another.getName(), this.getName());
        } else {
            System.out.println("Their power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Slytherin\nage: %s\nMagic Power: %s\nSly Power: %s\nRed Magic: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getSly(), this.getRedMagic());
    }
}
