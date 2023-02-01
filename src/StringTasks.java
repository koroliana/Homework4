public class StringTasks {
    public static void task1() {
        System.out.println("Cтроки. Задача №1");
        Employee.printEmployee();
        System.out.println();
    }

    public static void task2() {
        System.out.println("Cтроки. Задача №2");
        String fullname = Employee.fullName;
        Employee.fullName = fullname.toUpperCase();
        Employee.printEmployeeForReport();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Cтроки. Задача №3");
        Employee employee = new Employee("Семён", "Семёнович", "Иванов");
        String fullname = employee.fullName;
        employee.fullName = fullname.replace('ё', 'е');
        employee.printEmployee();
        System.out.println();
    }

}
