import java.util.*;

// Custom Exception Class
class InventoryException extends Exception {
    
    InventoryException(String msg) {
        super(msg);
    }
}

// Inventory Class
class Inventory {

    // HashMap to store item name and quantity
    HashMap<String, Integer> stock = new HashMap<>();

    // Constructor to add default items
    Inventory() {
        stock.put("Pen", 10);
        stock.put("Book", 5);
        stock.put("Pencil", 20);
    }

    // Method to view items
    void viewItems() {

        System.out.println("\nAvailable Stock:");

        for (String item : stock.keySet()) {
            System.out.println(item + " : " + stock.get(item));
        }
    }

    // Method to add item
    void addItem(String name, int qty) {

        if (stock.containsKey(name)) {

            int oldQty = stock.get(name);
            stock.put(name, oldQty + qty);

        } 
        else {

            stock.put(name, qty);
        }

        System.out.println("Item added successfully!");
    }

    // Method to remove item
    void removeItem(String name, int qty) throws InventoryException {

        if (!stock.containsKey(name)) {

            throw new InventoryException("Item not found!");

        } 
        else {

            int current = stock.get(name);

            if (qty > current) {

                throw new InventoryException("Not enough stock!");

            } 
            else {

                stock.put(name, current - qty);
                System.out.println("Item removed successfully!");
            }
        }
    }
}

// Main Class
public class InventoryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        while (true) {

            try {

                System.out.println("\n===== INVENTORY MENU =====");
                System.out.println("1. View Items");
                System.out.println("2. Add Item");
                System.out.println("3. Remove Item");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {

                    inv.viewItems();

                } 
                else if (choice == 2) {

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    inv.addItem(name, qty);
                } 
                else if (choice == 3) {

                    sc.nextLine(); // clear buffer

                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    inv.removeItem(name, qty);
                } 
                else if (choice == 4) {

                    System.out.println("Thank you!");
                    break;
                } 
                else {

                    throw new InventoryException("Invalid choice!");
                }

            } 
            catch (InputMismatchException e) {

                System.out.println("Enter numbers only!");
                sc.nextLine(); // clear wrong input

            } 
            catch (InventoryException e) {

                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}