class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void generateSalarySlip() {
        System.out.println("Employee Salary Slip");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

public class E4 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "EMP123", 5000);
        emp.generateSalarySlip();
        emp.setSalary(5500);S
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}