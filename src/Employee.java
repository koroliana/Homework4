public class Employee {
    private static String firstName = "Ivan";
    private static String middleName = "Ivanovich";
    private static String lastName = "Ivanov";
    public static String fullName = lastName + " " + firstName + " " + middleName;

    public Employee(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = lastName + " " + firstName + " " +middleName;
    }

    public static void printEmployee() {
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void printEmployeeForReport() {
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }


}
