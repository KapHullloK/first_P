public class Hufflepuff extends Hogwarts {
    private int tenacity;
    private int purpleMagic;

    public Hufflepuff(String name, int age, int magic, int tenacity, int purpleMagic) {
        super(name, age, magic);
        this.tenacity = tenacity;
        this.purpleMagic = purpleMagic;
    }


    public int getTenacity() {
        return tenacity;
    }

    public void setTenacity(int tenacity) {
        this.tenacity = tenacity;
    }

    public int getPurpleMagic() {
        return purpleMagic;
    }

    public void setPurpleMagic(int purpleMagic) {
        this.purpleMagic = purpleMagic;
    }

    public void hufflepuffVersus(Hufflepuff another) {
        if (this.tenacity + this.purpleMagic > another.getTenacity() + another.getPurpleMagic()) {
            System.out.format("%s is stronger than %s\n", this.getName(), another.getName());
        } else if (this.tenacity + this.purpleMagic < another.getTenacity() + another.getPurpleMagic()) {
            System.out.format("%s is stronger than %s\n", another.getName(), this.getName());
        } else {
            System.out.println("Their tenacity power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Hufflepuff\nage: %s\nMagic Power: %s\ntenacity Power: %s\nPurple Magic: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getTenacity(), this.getPurpleMagic());
    }
}
