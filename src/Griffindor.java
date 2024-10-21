public class Griffindor extends Hogwarts {
    private int brave;
    private int greenMagic;

    public Griffindor(String name, int age, int magic, int brave, int greenMagic) {
        super(name, age, magic);
        this.brave = brave;
        this.greenMagic = greenMagic;
    }


    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public int getGreenMagic() {
        return greenMagic;
    }

    public void setGreenMagic(int greenMagic) {
        this.greenMagic = greenMagic;
    }

    public void griffindorVersus(Griffindor griffindor2) {
        if (this.brave + this.greenMagic > griffindor2.getBrave() + griffindor2.getGreenMagic()) {
            System.out.format("%s is stronger than %s\n", this.getName(), griffindor2.getName());
        } else if (this.brave + this.greenMagic < griffindor2.getBrave() + griffindor2.getGreenMagic()) {
            System.out.format("%s is stronger than %s\n", griffindor2.getName(), this.getName());
        } else {
            System.out.println("Their power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Griffindor\nage: %s\nMagic Power: %s\nBrave Power: %s\nGreen Magic: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getBrave(), this.getGreenMagic());
    }
}