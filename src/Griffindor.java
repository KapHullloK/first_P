public class Griffindor extends Hogwarts {
    private int brave;

    public Griffindor(String name, int age, int magic, int brave) {
        super(name, age, magic);
        this.brave = brave;
    }


    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public void braveVersus(Griffindor griffindor2) {
        if (this.brave > griffindor2.getBrave()) {
            System.out.format("%s's brave is stronger than %s's\n", this.getName(), griffindor2.getName());
        } else if (this.brave < griffindor2.getBrave()) {
            System.out.format("%s's brave is stronger than %s's\n", griffindor2.getName(), this.getName());
        } else {
            System.out.println("Their brave power is equal ");
        }
    }

    @Override
    public String toString() {
        return String.format("<%s> from Griffindor\nage: %s\nMagic Power: %s\nBrave Power: %s",
                this.getName(), this.getAge(), this.getMagic(), this.getBrave());
    }
}