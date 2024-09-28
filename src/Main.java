import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        int year = 2024;
        int mob_year = 2022;
        boolean os = false;

        check_year(year);
        check_mobile_device(os, mob_year);
        get_days(34);
    }

    public static void check_year(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.format("%s год — високосный год\n", year);
        } else {
            System.out.format("%s год — невисокосный год\n", year);
        }
    }

    public static void check_mobile_device(boolean telephone_os, int date) {
        int currentYear = LocalDate.now().getYear();

        if (telephone_os) {
            if (currentYear > date)
                System.out.println("Вам нужно скачать облегченную версию приложения под Android");
            else {
                System.out.println("Вам нужно скачать обычную версию приложения под Android");
            }
        } else {
            if (currentYear > date)
                System.out.println("Вам нужно скачать облегченную версию приложения под iOS");
            else {
                System.out.println("Вам нужно скачать обычную версию приложения под iOS");
            }
        }
    }

    public static void get_days(int distance) {

        String ans = "";

        if (distance <= 20) {
            ans += "1";
        } else if (20 < distance && distance <= 60) {
            ans += "2";
        } else if (60 < distance && distance <= 100) {
            ans += "3";
        } else {
            ans = "Доставки нет";
        }

        System.out.println(ans);
    }
}
