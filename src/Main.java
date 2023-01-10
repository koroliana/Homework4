public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Циклы. Задача №1");
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Циклы. Задача №2");
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Циклы. Задача №3");
        for(int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Циклы. Задача №4");
        for(int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
    }

}