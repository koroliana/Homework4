public class CyclesPartTwo {
    public static void task11() {
        System.out.println("Циклы. Часть2. Задача №1");
        int monthlyContribution = 15000;
        int total1 = 0;
        int i = 0;
        System.out.println("Если просто копить по 15000 рублей в месяц:");
        while (total1 < 2_459_000) {
            i++;
            total1 = total1+monthlyContribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total1 +" рублей");
        }
        int total2 = 0;
        int j = 0;
        System.out.println();
        System.out.println("Если откладывать 15000 рублей в месяц на депозит под 12% годовых:");
        while (total2 < 2_459_000) {
            j++;
            total2 = total2 + total2/100 + monthlyContribution;
            System.out.println("Месяц " + j + ", сумма накоплений равна "+ total2 +" рублей");
        }
        System.out.println();
    }

    public static void task12() {
        System.out.println("Циклы. Часть2. Задача №2");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println();
        for(int i = 10; i > 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

    }

    public static void task13() {
        System.out.println("Циклы. Часть2. Задача №3");
        double thisYearPopulation = 12_000_000;
        float birthRate = 0.017F;
        float deathRate = 0.008F;
        for(int i = 1; i < 11; i++) {
            thisYearPopulation = thisYearPopulation + thisYearPopulation*birthRate - thisYearPopulation*deathRate;
            if(i == 1) {
                System.out.println("Через " + i + " год численность населения составит " + (int)thisYearPopulation);
            } else if (i<5) {
                System.out.println("Через " + i + " года численность населения составит " + (int)thisYearPopulation);
            }
            else System.out.println("Через " + i + " лет численность населения составит " + (int)thisYearPopulation);
        }
        System.out.println();
    }

    public static void task14() {
        System.out.println("Циклы. Часть2. Задача №4");
        int monthlyContribution = 15000;
        double total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i++;
            total = total + total*0.07 + monthlyContribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (int)total + " рублей");
        }
        System.out.println();
    }

    public static void task15() {
        System.out.println("Циклы. Часть2. Задача №5");
        int monthlyContribution = 15000;
        double total = 0;
        int i = 0;
        while (total < 12_000_000) {
            i++;
            total = total + total*0.07 + monthlyContribution;
            if (i%6==0)
            {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + (int)total + " рублей");
            }

        }
        System.out.println();
    }

    public static void task16() {
        System.out.println("Циклы. Часть2. Задача №6");
        int monthlyContribution = 15000;
        double total = 0;
        int month = 0;
        int year = 0;
        while (month != 12*9) {
            month++;
            total = total + total*0.07 + monthlyContribution;
            if (month%12==0){
                year++;
                if(year == 1) {
                    System.out.println("Прошел " + year + " год");
                } else if (year<5) {
                    System.out.println("Прошло " + year + " года");
                }
                else System.out.println("Прошло " + year + " лет");
            }
            if (month%6==0)
            {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + (int)total + " рублей");
            }
        }
        System.out.println();
    }

    public static void task17() {
        System.out.println("Циклы. Часть2. Задача №7");
        int firstFriday = 6;
        for (int day = firstFriday; day <= 31; day++) {
            if(day%7 == firstFriday) {
                System.out.println("Cегодня пятница " + day + "-е. Нужно подготовить отчет.");
            }
        }
        System.out.println();
    }

    public static void task18() {
        System.out.println("Циклы. Часть2. Задача №8");
        int currentYear = 2023;
        for (int i = currentYear-200; i <= currentYear + 100; i++) {
            if(i%79 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
