import java.text.DecimalFormat;

public class ArraysPartTwo {
    public static void task1() {
        System.out.println("Массивы. Часть2. Задача №1");
        int[] arr = Method.generateRandomArray();
        int sum = Method.sumArray(arr);
        System.out.println("Сумма трат за месяц составила " + new DecimalFormat("###,###").format(sum) + " рублей.");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Массивы. Часть2. Задача №2");
        int[] arr = Method.generateRandomArray();
        int min = Method.findArrayMin(arr);
        int max = Method.findArrayMax(arr);
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей.");
        System.out.println();
    }

}
