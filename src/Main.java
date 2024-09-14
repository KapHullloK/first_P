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

        int teachAge = 21;
        String ans4 = String.format("Если возраст человека равен %s, то ему нужно ходить ", teachAge);

        if (2 <= teachAge && teachAge <= 6) {
            ans4 += "в детский сад";
        } else if (7 <= teachAge && teachAge <= 17) {
            ans4 += "в школу";
        } else if (18 <= teachAge && teachAge <= 24) {
            ans4 += "в университете";
        } else {
            ans4 += "на работу";
        }

        System.out.println(ans4);
        System.out.println("-------------");

        int childAge = 7;
        String ans5 = String.format("Если возраст ребенка равен %s, то ему ", childAge);

        if (childAge <= 5) {
            ans5 += "нельзя кататься на аттракционе";
        } else if (5 < childAge && childAge < 14) {
            ans5 += "можно кататься на аттракционе в сопровождении";
        } else if (14 <= childAge) {
            ans5 += "без сопровождения взрослого";
        }

        System.out.println(ans5);
        System.out.println("-------------");

        int capacity = 102;
        int seatPlace = 60;
        int curSituation = 92;

        String ans6 = "";

        if (0 <= curSituation && curSituation <= seatPlace) {
            ans6 += "Есть сидячие места";
        } else if (seatPlace < curSituation && curSituation <= capacity) {
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
