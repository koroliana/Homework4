public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();


    }

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

    public static void task5() {
        System.out.println("Циклы. Задача №5");
        for(int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Циклы. Задача №6");
        for(int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task7() {
        System.out.println("Циклы. Задача №7");
        for(int i = 1; i <= 512; i = i*2) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Циклы. Задача №8");
        int everyMonthMoney = 29000;
        int total = 0;
        for(int i = 1; i <= 12; i++) {
            total = total+everyMonthMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total +" рублей");
        }
        System.out.println();
    }

    public static void task9() {
        System.out.println("Циклы. Задача №9");
        int everyMonthMoney = 29000;
        int total = 0;
        for(int i = 1; i <= 12; i++) {
            total = total + total/100 + everyMonthMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+ total +" рублей");
        }
        System.out.println();
    }

    public static void task10() {
        System.out.println("Циклы. Задача №10");
        for(int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2*i);
        }
        System.out.println();
    }

}