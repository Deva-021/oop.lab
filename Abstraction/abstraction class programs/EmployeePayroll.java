 abstract class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public abstract double calculateSalary();
}

 class Manager extends Employee {
    private double monthlySalary;

    public Manager(String name, int employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

 class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, int employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Manager", 101, 5000.0);
        Developer developer = new Developer("Bob Developer", 201, 30.0, 160);

        System.out.println("Manager: " + manager.getName() + ", ID: " + manager.getEmployeeId() + ", Salary: " + manager.calculateSalary());
        System.out.println("Developer: " + developer.getName() + ", ID: " + developer.getEmployeeId() + ", Salary: " + developer.calculateSalary());
    }
}