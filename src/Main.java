import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        boolean clientOS = false;

        if (clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("---------------");


        boolean userOS = 0 == 0;
        int clientDeviceYear = 2015;

        if (clientDeviceYear < 2015 && userOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && !userOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && userOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("---------------");


        int year = 2016;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year >= 1584) {
            System.out.format("%s год является високосным\n", year);
        } else {
            System.out.format("%s год не является високосным\n", year);
        }
        System.out.println("---------------");


        int deliveryDistance = 925;
        String ans = "Потребуется дней: ";

        if (deliveryDistance <= 20) {
            ans += "1";
        } else if (20 < deliveryDistance && deliveryDistance < 60) {
            ans += "2";
        } else if (60 <= deliveryDistance && deliveryDistance <= 100) {
            ans += "3";
        } else {
            ans = "Доставки нет";
        }

        System.out.println(ans);
        System.out.println("---------------");


        int monthNumber = 8;
        monthNumber = (monthNumber + 2) / 3;
        String season = "";

        switch (monthNumber) {
            case 1:
                season += "Зима";
                break;
            case 2:
                season += "Весна";
                break;
            case 3:
                season += "Лето";
                break;
            case 4:
                season += "Осень";
                break;
            default:
                season += "Такого сезона не существует";
        }
        System.out.println(season);

    }
}
