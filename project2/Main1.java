import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee Payroll");
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        System.out.println("\nEmployee ID: " + emp.getEmpId());
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Salary: $" + emp.getSalary());

        double netSalary = emp.calculateNetSalary();
        System.out.println("Net Salary after deductions: $" + netSalary);

        sc.close();
    }
}

class Employee {
    private int empId;
    private String empName;
    private double salary;

    public Employee(int id, String name, double salary) {
        empId = id;
        empName = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double calculateNetSalary() {
        double tax = salary * 0.10;
        double pf  = salary * 0.05;
        return salary - (tax + pf);
    }
}
