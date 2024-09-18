import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        int[] lst1 = new int[3];

        for (int i = 0; i < lst1.length; i++) {
            lst1[i] = i + 1;
            System.out.print(lst1[i]);
            if (i + 1 != lst1.length) {
                System.out.print(", ");
            }
        }

        System.out.println();
        float[] lst2 = {1.57F, 7.654F, 9.986F};
        for (int i = 0; i < lst2.length; i++) {
            System.out.print(lst2[i]);
            if (i + 1 != lst2.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] lst3 = {1, 3, 6, 9};
        for (int i = 0; i < lst3.length; i++) {
            System.out.print(lst3[i]);
            if (i + 1 != lst3.length) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = lst1.length - 1; i >= 0; i--) {
            System.out.print(lst1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = lst2.length - 1; i >= 0; i--) {
            System.out.print(lst2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = lst3.length - 1; i >= 0; i--) {
            System.out.print(lst3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        for (int i = 0; i < lst1.length; i++) {
            if (lst1[i] % 2 != 0) {
                lst1[i] += 1;
            }
        }

        System.out.println();
        for (int i = 0; i < lst1.length; i++) {
            System.out.print(lst1[i]);
            if (i != lst1.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
