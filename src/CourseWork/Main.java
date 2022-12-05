package CourseWork;

public class Main {

    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees[0] = new Employee("Кузьмин Федор Алексеевич", 4, 654_821);
        employees[1] = new Employee("Павлова Мария Кирилловна", 2, 654_826);
        employees[2] = new Employee("Орлова Надежда Викторовна", 1, 12_856);
        employees[3] = new Employee("Иванов Николай Николаевич", 5, 458_260);
        employees[4] = new Employee("Борунов Сергей Петрович", 3, 485_426);
        employees[5] = new Employee("Захаров Валентин Геннадьевич", 2, 82_456);
        employees[6] = new Employee("БулкинаЕкатерина Сергеевна", 1, 45_821);
        employees[7] = new Employee("Воробьева Марина Анатольевна", 4, 75_126);
        employees[8] = new Employee("Осипов Роман Дмитриевич", 5, 65_823);
        employees[9] = new Employee("Лобанов Артемий Николаевич", 3, 95_642);


        printEmployees();
        System.out.println("Сумма затрат на зарплаты составляет " + getAndCalculateSalarySum());
        System.out.println("Сотрудник с минимальной зарплатой " + getMin());
        System.out.println("Сотрудник с максимальной зарплатой " + getMax());
        System.out.println("Среднее значение зарплат составляет " + averageSalary());
        fullEmployeeList();


    }
    public static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int getAndCalculateSalarySum(){
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    public static String getMin() {
        int minSalary = employees[0].getSalary();
        String minSalaryEmployee = null;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
            minSalaryEmployee = employees[i].getEmployeeName();
        }
        return minSalaryEmployee + ", она составляет " + minSalary;
    }
    public static String getMax() {
        int maxSalary = employees[9].getSalary();
        String maxSalaryEmployee = null;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
            maxSalaryEmployee = employees[i].getEmployeeName();
        }
        return maxSalaryEmployee + ", она составляет " + maxSalary;
    }
    public static int averageSalary() {
        return getAndCalculateSalarySum() / 10;
    }
    public static void fullEmployeeList() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getEmployeeName());
            }

        }
    }
}
