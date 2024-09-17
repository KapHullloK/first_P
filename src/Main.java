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


        } else {
            System.out.format("%s год не является високосным\n", year);
        }
        System.out.println("---------------");



        } else {
            ans = "Доставки нет";
        }

        System.out.println(ans);
        System.out.println("---------------");


        int monthNumber = 8;
        String season = "";

        switch (monthNumber) {
            case 1:
                season += "Зима";
                break;
            case 2:
                season += "Зима";
                break;
            case 3:
                season += "Зима";
                break;
            case 4:
                season += "Весна";
                break;
            case 5:
                season += "Весна";
                break;
            case 6:
                season += "Весна";
                break;
            case 7:
                season += "Лето";
                break;
            case 8:
                season += "Лето";
                break;
            case 9:
                season += "Лето";
                break;
            case 10:
                season += "Осень";
                break;
            case 11:
                season += "Осень";
                break;
            case 12:
                season += "Осень";
                break;
            default:
                season += "Такого сезона не существует";
        }
        System.out.println(season);

    }
}
