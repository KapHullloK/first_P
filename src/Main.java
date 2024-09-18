import java.lang.Math;


public class Main {

    public static void main(String[] args) {

        int month = 0;
        int total = 0;

        while (total < 2_459_000) {
            total += 15_000;
            month++;
            if (month % 12 == 0) {
                total += total / 100 * 12;
            }
        }
        System.out.format("Месяц %s, сумма накоплений равна %s рублей\n", month, total);
        System.out.println("-----------");

        int cur = 0;

        while (cur < 10) {
            cur++;
            System.out.print(cur);
            System.out.print(" ");
        }
        System.out.println();
        for (; cur > 0; cur--) {
            System.out.print(cur);
            System.out.print(" ");
        }
        System.out.println("\n-----------");

        int people = (int) 12e6;
        int year = 1;
        for (; year <= 10; year++) {
            people += people / 1000 * 9;
            System.out.format("Год %s, численность населения составляет %s\n", year, people);
        }
        System.out.println("-----------");

        int bank_account = 15_000;
        month = 0;

        while (bank_account < (int) 12e6) {
            bank_account += bank_account / 100 * 7;
            month++;
        }

        System.out.format("Месяц %s, сумма накоплений равна %s рублей\n", month, bank_account);

        System.out.println("-----------");

        int bank_account2 = 15_000;
        month = 0;

        while (month < 9 * 12) {
            bank_account2 += bank_account2 / 100 * 7;
            month++;
            if (month % 6 == 0) {
                System.out.format("Полгода %s, сумма накоплений равна %s рублей\n", month / 6, bank_account2);
            }
        }
        System.out.println("-----------");

        int friday = 5;

        for (; friday < 31; friday += 7) {
            System.out.format("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", friday);
        }
        System.out.println("-----------");

        int cur_year = 2024;

        for (int left_bound = cur_year - 200; left_bound < cur_year + 100; left_bound++) {
            if (left_bound % 79 == 0) {
                System.out.println(left_bound);
            }
        }

    }
}
