import java.lang.Math;


public class Main {
    public static void main(String[] args) {

        int age = 12;
        String ans = String.format("Если возраст человека равен %s, то ", age);

        if (age < 18) {
            ans += "он не достиг совершеннолетия, нужно немного подождать";
        } else {
            ans += "он совершеннолетний";
        }

        System.out.println(ans);
        System.out.println("-------------");

        int degree = 6;
        String ans2 = String.format("На улице %s градусов ", degree);

        if (degree < 5) {
            ans2 += "нужно надеть шапку";
        } else {
            ans2 += "можно идти без шапки";
        }

        System.out.println(ans2);
        System.out.println("-------------");

        int speed = 333;
        String ans3 = String.format("Если скорость %s, то ", speed);

        if (speed <= 60) {
            ans3 += "можно ездить спокойно";
        } else {
            ans3 += "придется заплатить штраф";
        }

        System.out.println(ans3);
        System.out.println("-------------");

        int teach_age = 21;
        String ans4 = String.format("Если возраст человека равен %s, то ему нужно ходить ", teach_age);

        if (2 <= teach_age && teach_age <= 6) {
            ans4 += "в детский сад";
        } else if (7 <= teach_age && teach_age <= 17) {
            ans4 += "в школу";
        } else if (18 <= teach_age && teach_age <= 24) {
            ans4 += "в университете";
        } else {
            ans4 += "на работу";
        }

        System.out.println(ans4);
        System.out.println("-------------");

        int child_age = 7;
        String ans5 = String.format("Если возраст ребенка равен %s, то ему ", child_age);

        if (child_age <= 5) {
            ans5 += "нельзя кататься на аттракционе";
        } else if (5 < child_age && child_age < 14) {
            ans5 += "можно кататься на аттракционе в сопровождении";
        } else if (14 <= child_age) {
            ans5 += "без сопровождения взрослого";
        }

        System.out.println(ans5);
        System.out.println("-------------");

        int capacity = 102;
        int seat_place = 60;
        int cur_situation = 92;

        String ans6 = "";

        if (0 <= cur_situation && cur_situation <= seat_place) {
            ans6 += "Есть сидячие места";
        } else if (seat_place < cur_situation && cur_situation <= capacity) {
            ans6 += "Есть стоячие места";
        } else {
            ans6 += "Мест нет";
        }

        System.out.println(ans6);
        System.out.println("-------------");
        
        int one = 1;
        int two = 3;
        int three = 7;

        if (one >= two && one >= three) {
            System.out.format("Самое большое число - %s", one);
        } else if (two >= one && two >= three) {
            System.out.format("Самое большое число - %s", two);
        } else {
            System.out.format("Самое большое число - %s", three);
        }

    }
}
