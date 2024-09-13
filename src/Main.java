import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        int x1 = (int) 1e6;
        byte x2 = 12;
        short x3 = 1000;
        long x4 = (long) 1e12;
        float y1 = 1e5F;
        double y2 = 1e14;


        System.out.format("Значение переменной x1 с типом int равно %s\n", x1);
        System.out.format("Значение переменной x2 с типом byte равно %s\n", x2);
        System.out.format("Значение переменной x3 с типом short равно %s\n", x3);
        System.out.format("Значение переменной x4 с типом long равно %s\n", x4);
        System.out.format("Значение переменной y1 с типом float равно %s\n", y1);
        System.out.format("Значение переменной y2 с типом double равно %s\n", y2);
        System.out.println("--------------");


        float task2_1 = 27.12F;
        long task2_2 = 987678965549L;
        float task2_3 = 2.786F;
        int task2_4 = 569;
        int task2_5 = -159;
        int task2_6 = 27897;
        byte task2_7 = 67;

        System.out.println(task2_1);
        System.out.println(task2_2);
        System.out.println(task2_3);
        System.out.println(task2_4);
        System.out.println(task2_5);
        System.out.println(task2_6);
        System.out.println(task2_7);
        System.out.println("--------------");

        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int papers = 480;
        int ans = papers / (teacher1 + teacher2 + teacher3);
        System.out.format("На каждого ученика рассчитано %s листов бумаги\n", ans);
        System.out.println("--------------");

        int boat = 16;
        int time = 2;
        int task1 = 20;
        int task2 = 60 * 24;
        int task3 = 60 * 24 * 3;
        int task4 = 60 * 24 * 30;

        System.out.format("За %s минут машина произвела %s штук бутылок\n", task1, task1 / time * boat);
        System.out.format("За %s минут машина произвела %s штук бутылок\n", task2, task2 / time * boat);
        System.out.format("За %s минут машина произвела %s штук бутылок\n", task3, task3 / time * boat);
        System.out.format("За %s минут машина произвела %s штук бутылок\n", task4, task4 / time * boat);
        System.out.println("--------------");

        int bottle = 120;
        int white = 2;
        int brown = 4;

        System.out.format("В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски\n",
                bottle / (white + brown), bottle / (white + brown) * white, bottle / (white + brown) * brown);
        System.out.println("--------------");


        int bananaAmount = 5;
        int bananaWeight = 80;
        int milkAmount = 200;
        int milkWeight = 105;
        int iceAmount = 2;
        int iceWeight = 100;
        int eggAmount = 4;
        int eggWeight = 70;
        float resG = bananaAmount * bananaWeight + milkAmount * milkWeight + iceAmount * iceWeight + eggAmount * eggWeight;
        float resKg = resG / 1000F;
        System.out.format("Gram - %s\n", resG);
        System.out.format("Kg - %s\n", resKg);
        System.out.println("--------------");

        int min = 250;
        int max = 500;
        int neededKg = 7;
        int neededGrams = neededKg * 1000;
        System.out.format("Если худеть на %s грамм - %s\n", min, neededGrams / min);
        System.out.format("Если худеть на %s грамм - %s\n", max, neededGrams / max);
        System.out.format("В среднем %s\n", ((neededGrams / min) + (neededGrams / max)) / 2);
        System.out.println("--------------");

        double mashaSalary = 67760;
        double denisSalary = 83690;
        double cristinaSalary = 76230;
        System.out.format("Маша теперь получает %s рублей. Годовой доход вырос на %s рублей\n",
                mashaSalary * 1.1, mashaSalary * 0.1 * 12);
        System.out.format("Денис теперь получает %s рублей. Годовой доход вырос на %s рублей\n",
                denisSalary * 1.1, denisSalary * 0.1 * 12);
        System.out.format("Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей\n",
                cristinaSalary * 1.1, cristinaSalary * 0.1 * 12);
    }
}
