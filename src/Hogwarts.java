public abstract class Hogwarts {
    private String name;
    private int age;
    private int magic;


    public Hogwarts(String name, int age, int magic) {
        this.name = name;
        this.age = age;
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }


    public void magicVersus(Hogwarts hogwarts2) {
        if (this.magic > hogwarts2.getMagic()) {
            System.out.format("%s's magic is stronger than %s's\n", this.name, hogwarts2.getName());
        } else if (this.magic < hogwarts2.getMagic()) {
            System.out.format("%s's magic is stronger than %s's\n", hogwarts2.getName(), this.name);
        } else {
            System.out.println("Their magical power is equal");
        }
    }
}




