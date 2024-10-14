

public class Main {

    public static void main(String[] args) {

        Griffindor test1 = new Griffindor("July", 16, 23, 55);
        Griffindor test2 = new Griffindor("Nanu", 18, 43, 47);
        Slytherin test3 = new Slytherin("Bob", 16, 22, 15);
        Slytherin test4 = new Slytherin("Kracky", 14, 12, 18);

        // Testing "comparing local two students"
        System.out.println(test1);
        test1.magicVersus(test2);
        test1.braveVersus(test2);

        System.out.println();

        // Testing "comparing local two students"
        System.out.println(test3);
        test3.magicVersus(test4);
        test3.slyVersus(test4);

        System.out.println();

        // Testing "comparing any two students"
        test1.magicVersus(test3);

    }

}
