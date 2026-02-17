import java.util.Scanner; 
 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
 
        System.out.println("Enter Account Holder Name:"); 
        String name = sc.nextLine(); 
 
        System.out.println("Enter Account Number:"); 
        String accNo = sc.nextLine(); 
 
        System.out.println("Enter Initial Balance:"); 
        double balance = sc.nextDouble(); 
 
        BankAccount account = new SavingsAccount(accNo, name, balance); 
 
        System.out.println("Enter Deposit Amount:"); 
        double deposit = sc.nextDouble(); 
        account.deposit(deposit); 
 
        System.out.println("Enter Withdrawal Amount:"); 
        double withdraw = sc.nextDouble(); 
        account.withdraw(withdraw); 
 
        account.displayDetails(); 
 
        sc.close(); 
    } 
} 
abstract class BankAccount { 
    protected String accountNumber; 
    protected String accountHolderName; 
    protected String accountType; 
    protected double balance; 
    protected double minimumBalance; 
 
    BankAccount(String accNo, String name, String type, double balance, double minBal) 
{ 
        this.accountNumber = accNo; 
        this.accountHolderName = name; 
        this.accountType = type; 
        this.balance = balance; 
        this.minimumBalance = minBal; 
    } 
 
    abstract void deposit(double amount); 
    abstract void withdraw(double amount); 
 
    void displayDetails() { 
        System.out.println("\nAccount Details:"); 
        System.out.println("Account Holder: " + accountHolderName); 
        System.out.println("Account Number: " + accountNumber); 
        System.out.println("Account Type: " + accountType); 
        System.out.println("Balance: $" + balance); 
    } 
} 
 
class SavingsAccount extends BankAccount { 
 
    SavingsAccount(String accNo, String name, double balance) { 
        super(accNo, name, "Savings", balance, 500); 
    } 
 
    void deposit(double amount) { 
        balance += amount; 
        System.out.println("Deposited: $" + amount); 
    } 
 
    void withdraw(double amount) { 
        if (balance - amount >= minimumBalance) { 
            balance -= amount; 
            System.out.println("Withdrawn: $" + amount); 
        } else { 
            System.out.println("Insufficient balance! Minimum balance is $500"); 
        } 
    } 
} 
 
 
 
 
 
 
 
 
 
 
