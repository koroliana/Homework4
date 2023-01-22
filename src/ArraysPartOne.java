public class ArraysPartOne {
    public static int[] threeInt = new int[3];
    public static double[] threeDouble = {1.57, 7.654, 9.986};
    public static String[] threeString = {"раз","два","три"};

    public static void task1_2() {
        System.out.println("Массивы. Часть1. Задача №1-2");
        threeInt[0] = 1;
        threeInt[1] = 2;
        threeInt[2] = 3;
        System.out.print("Целочисленный массив: ");
        Method.printMassive(threeInt); // через Object не получается обратиться к массиву, решила перегрузкой метода

        System.out.print("Дробный массив: ");
        Method.printMassive(threeDouble);

        System.out.print("Cтроковый массив: ");
        Method.printMassive(threeString);  //через implements без обращения к Method не удалось запустить метод
        System.out.println();
    }

    public static void task3() {
        System.out.println("Массивы. Часть1. Задача №3");
        threeInt[0] = 1;
        threeInt[1] = 2;
        threeInt[2] = 3;
        System.out.println("Печатаем наоборот:");
        Method.reversePrintMassive(threeInt);
        Method.reversePrintMassive(threeDouble);
        Method.reversePrintMassive(threeString);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Массивы. Часть1. Задача №4");
        threeInt[0] = 1;
        threeInt[1] = 2;
        threeInt[2] = 3;
        for (int i = 0; i<threeInt.length; i++) {
            if (threeInt[i] % 2 == 1) {
                int number = threeInt[i];
                threeInt[i] = number + 1;
            }
        }

        System.out.println("Все четные:");
        Method.printMassive(threeInt);
        System.out.println();
    }


}
