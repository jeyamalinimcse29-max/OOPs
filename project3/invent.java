import java.util.HashMap;
import java.util.Scanner;

public class InventorySystem {

    public static void main(String[] args) {

        HashMap<String, Integer> stock = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n--- INVENTORY SYSTEM ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Stock");
            System.out.println("3. Remove Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter product name: ");
                String name = sc.nextLine();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                stock.put(name, qty);
                System.out.println("Product added!");

            } else if (choice == 2) {
                System.out.print("Enter product name: ");
                String name = sc.nextLine();

                if (stock.containsKey(name)) {
                    System.out.print("Enter new quantity: ");
                    int qty = sc.nextInt();
                    stock.put(name, qty);
                    System.out.println("Stock updated!");
                } else {
                    System.out.println("Product not found!");
                }

            } else if (choice == 3) {
                System.out.print("Enter product name: ");
                String name = sc.nextLine();
                stock.remove(name);
                System.out.println("Product removed!");

            } else if (choice == 4) {
                System.out.println("\n--- Inventory List ---");
                for (String product : stock.keySet()) {
                    System.out.println(product + " : " + stock.get(product));
                }

            } else if (choice == 5) {
                System.out.println("Exiting...");

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}