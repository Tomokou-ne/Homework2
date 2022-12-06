package CourseWork;

public class Employee {

    private String employeeName;
    private int department;
    private int salary;
    private int id;
    private static int counter;

    public Employee(String employeeName, int department,int salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int setDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return "ФИО сотрудника " + employeeName + ", отдел " + department + ", зарплата сотрудника " + salary + ", id " + id;
    }

}
