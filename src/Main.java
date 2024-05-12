import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] dArray = {1.57, 7.654, 9.986};
        boolean[] bArray = {true, false, true, false};
        System.out.println();
        System.out.println("Задание №2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < dArray.length; i++) {
            System.out.print(dArray[i]);
            if (i < dArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < bArray.length; i++) {
            System.out.print(bArray[i]);
            if (i < bArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание №3");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = dArray.length - 1; i >= 0; i--) {
            System.out.print(dArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = bArray.length - 1; i >= 0; i--) {
            System.out.print(bArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание №4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}