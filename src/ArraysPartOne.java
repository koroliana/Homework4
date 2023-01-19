public class ArraysPartOne {

    public static void task1() {
        System.out.println("Массивы. Часть1. Задача №1");
        int[] threeInt = new int[3];
        threeInt[0] = 1;
        threeInt[1] = 2;
        threeInt[2] = 3;
        System.out.print("Целочисленный массив: ");
        for (int j : threeInt) {
            System.out.print(j + " ");
        }
        System.out.println();
        double[] threeDouble = {1.57, 7.654, 9.986};
        System.out.print("Дробный массив: ");
        for (double v : threeDouble) {
            System.out.print(v + " ");
        }
        System.out.println();
        String[] threeString = {"раз","два","три"};
        System.out.print("Cтроковый массив: ");
        for (String s : threeString) {
            System.out.print(s + " ");
        }

        System.out.println();
    }


}
