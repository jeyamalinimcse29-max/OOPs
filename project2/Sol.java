import java.util.Scanner; 
public class Sol { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("Enter Employee Name:"); 
        String name = sc.nextLine(); 
 
        System.out.println("Choose Employee Type:"); 
        System.out.println("1. Full Time"); 
        System.out.println("2. Part Time"); 
 
        int n = sc.nextInt(); 
 
        Employee e; 
 
        if (n == 1) { 
            System.out.println("Enter Monthly Salary:"); 
            double salary = sc.nextDouble(); 
            e = new FullTime(name, salary); 
        } else { 
            System.out.println("Enter Hourly Rate:"); 
            double rate = sc.nextDouble(); 
            System.out.println("Enter Hours Worked:"); 
            int hours = sc.nextInt(); 
            e = new PartTime(name, rate, hours); 
        } 
 
        e.getDetails(); 
        e.calculateSalary(); 
    } 
} 
interface Employee { 
    void getDetails(); 
    void calculateSalary(); 
} 
 
class FullTime implements Employee { 
    String name; 
    double monthlySalary; 
 
    FullTime(String name, double monthlySalary) { 
        this.name = name; 
        this.monthlySalary = monthlySalary; 
    } 
 
    public void getDetails() { 
        System.out.println("Employee Name: " + name); 
        System.out.println("Employee Type: Full Time"); 
    } 
 
    public void calculateSalary() { 
        System.out.println("Monthly Salary: " + monthlySalary); 
    } 
} 
 
class PartTime implements Employee { 
    String name; 
    double hourlyRate; 
    int hoursWorked; 
 
    PartTime(String name, double hourlyRate, int hoursWorked) { 
        this.name = name; 
        this.hourlyRate = hourlyRate; 
        this.hoursWorked = hoursWorked; 
    } 
 
    public void getDetails() { 
        System.out.println("Employee Name: " + name); 
        System.out.println("Employee Type: Part Time"); 
    } 
 
    public void calculateSalary() { 
        double salary = hourlyRate * hoursWorked; 
        System.out.println("Total Salary: " + salary); 
    } 
} 