import java.lang.Math;


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n-----------");

        for (int i = 10; i > 0; i--) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n-----------");


        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("\n-----------");

        for (int i = 10; i >= -10; i--) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n-----------");

        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("\n-----------");

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n-----------");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n-----------");

        int total = 0;
        int amount = 29000;

        for (int i = 1; i <= 12; i++) {
            total += amount;
            System.out.format("Месяц %s, сумма накоплений равна %s рублей\n", i, total);
        }
        System.out.println("-----------");

        int bank_account = 0;

        for (int i = 1; i <= 12; i++) {
            bank_account += amount;
            bank_account += bank_account / 100;
            System.out.format("Месяц %s, сумма накоплений равна %s рублей\n", i, bank_account);
        }
        System.out.println("-----------");


        for (int i = 1; i <= 10; i++) {
            System.out.print(2 * i);
            System.out.print(" ");
        }

    }
}
