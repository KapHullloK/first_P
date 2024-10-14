public class Slytherin extends Hogwarts {
    private int sly;

    public Slytherin(String name, int age, int magic, int sly) {
        super(name, age, magic);
        this.sly = sly;
    }


    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        this.sly = sly;
    }

    public void slyVersus(Slytherin another) {
        if (this.sly > another.getSly()) {
            System.out.format("%s's sly is stronger than %s's\n", this.getName(), another.getName());
        } else if (this.sly < another.getSly()) {
            System.out.format("%s's sly is stronger than %s's\n", another.getName(), this.getName());
        } else {
            System.out.println("Their sly power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Slytherin\nage: %s\nMagic Power: %s\nSly Power: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getSly());
    }
}
