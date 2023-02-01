import java.time.LocalDate;

public class MethodsPartOne {
    public static void task1() {
        System.out.println("Методы. Задача №1");
        int year = 2021;
        if(Method.isYearLeap(year)) {
            System.out.println("Год " + year + " является високосным");
        }
        else System.out.println("Год " + year + " не является високосным");

        System.out.println();
    }

    public static void task2() {
        System.out.println("Методы. Задача №2");
        byte system = 1;
        int year = 2020;
        findAppVersion(system, year);
        System.out.println();
    }

    public static void findAppVersion(byte system, int year) {
        int currentYear = LocalDate.now().getYear();
        if (system == 1) {
            if (year < 2008) {
                System.out.println("Извините, вашему устройству Android пора на пенсию");
            }
            else if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (year == currentYear)
            {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            else System.out.println("Вы из будущего? Для вашего устройства Android " + year + " года приложение ещё не создано");
        }
        else if (system == 2) {
            if (year < 2008) {
                System.out.println("Извините, вашему устройству iOS пора на пенсию");
            } else if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (year == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else System.out.println("Вы из будущего? Для вашего устройства iOS " + year + " года приложение ещё не создано");
        }

    }

    public static void task3() {
        System.out.println("Методы. Задача №3");
        int deliveryDistance = 20;
        if (calculateDeliveryDays(deliveryDistance) == 0) {
            System.out.println("Свыше 100 км доставки нет");
        }
        else System.out.println("Для доставки на " + deliveryDistance + " км потребуется дней: " + calculateDeliveryDays(deliveryDistance));
        System.out.println();
    }

    public static byte calculateDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;            
        } else if (distance <= 100) {
            return 3;
        } else return 0;

    }

}
