import java.util.Random;

public interface Method {
    static void printMassive(Object[] objectMassive) { //тот же метод внутри класса ArraysPartOne не объявлялся, objectMassive подсвечивался красным
        for (int i = 0; i<objectMassive.length;i++) {
            if (i==objectMassive.length-1 ) {
                System.out.print(objectMassive[i]);
            }
            else System.out.print(objectMassive[i] + ", ");
        }
        System.out.println();
    }

    static void printMassive(int[] intMassive) {
        for (int i = 0; i<intMassive.length;i++) {
            if (i==intMassive.length-1 ) {
                System.out.print(intMassive[i]);
            }
            else System.out.print(intMassive[i] + ", ");
        }
        System.out.println();
    }

    static void printMassive(double[] doubleMassive) {
        for (int i = 0; i<doubleMassive.length;i++) {
            if (i==doubleMassive.length-1 ) {
                System.out.print(doubleMassive[i]);
            }
            else System.out.print(doubleMassive[i] + ", ");
        }
        System.out.println();
    }

    static void reversePrintMassive(Object[] objectMassive) {
        for (int i = objectMassive.length-1; i>=0; i--) {
            if (i==0 ) {
                System.out.print(objectMassive[i]);
            }
            else System.out.print(objectMassive[i] + ", ");
        }
        System.out.println();
    }

    static void reversePrintMassive(int[] intMassive) {
        for (int i = intMassive.length-1; i>=0; i--) {
            if (i==0 ) {
                System.out.print(intMassive[i]);
            }
            else System.out.print(intMassive[i] + ", ");
        }
        System.out.println();
    }

    static void reversePrintMassive(double[] doubleMassive) {
        for (int i = doubleMassive.length-1; i>=0; i--) {
            if (i==0 ) {
                System.out.print(doubleMassive[i]);
            }
            else System.out.print(doubleMassive[i] + ", ");
        }
        System.out.println();
    }

    static void reversePrintMassive(char[] charMassive) {
        for (int i = charMassive.length-1; i>=0; i--) {
            System.out.print(charMassive[i]);
        }
        System.out.println();
    }

    static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    static int sumArray(int[] intMassive) {
        int sum = 0;
        for (int number: intMassive) {
            sum = sum + number;
        }
        return sum;
    }

    static int findArrayMin(int[] intMassive) {
        int min = intMassive[0];
        for (int i = 1; i < intMassive.length; i++) {
            if (min > intMassive[i]) {
                    min = intMassive[i];
            }
        }
        return min;
    }

    static int findArrayMax(int[] intMassive) {
        int max = intMassive[0];
        for (int i = 1; i < intMassive.length; i++) {
            if (max < intMassive[i]) {
                max = intMassive[i];
            }
        }
        return max;
    }

    static double findArrayAverage(int[] intMassive) {
        double sum = sumArray(intMassive);
        return sum/intMassive.length;
    }

}