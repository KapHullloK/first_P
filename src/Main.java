public class Main {

    public static void main(String[] args) {
        int[] lst1 = {2, 4, 5, 7, 22};
        int ans1 = 0;

        for (int j : lst1) {
            ans1 += j;
        }

        System.out.format("Сумма трат за месяц составила %s рублей\n", ans1);

        int[] lst2 = {3, 6, 11, 213, 22};

        int ans_max = -1;
        int ans_min = (int) 1e6;

        for (int j : lst2) {
            if (ans_max < j) ans_max = j;
            if (ans_min > j) ans_min = j;
        }

        System.out.format("Минимальная сумма трат за неделю составила %s рублей." +
                " Максимальная сумма трат за неделю составила %s рублей\n", ans_min, ans_max);


        int[] lst3 = {123, 213, 11, 34243, 7897};

        int ans3 = 0;

        for (int j : lst3) {
            ans3 += j;
        }

        System.out.format("Средняя сумма трат за месяц составила %s рублей\n", (double) ans3 / lst3.length);


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
