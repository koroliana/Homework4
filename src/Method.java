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

}