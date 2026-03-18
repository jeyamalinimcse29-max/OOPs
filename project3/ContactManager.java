import java.util.*;

// Contact class (Generic type)
class Contact<T> {
    private String name;
    private T phone;
    private String email;

    public Contact(String name, T phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public T getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println("Name: " + name + ", Phone: " + phone + ", Email: " + email);
    }
}

public class ContactManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collection using Generics
        ArrayList<Contact<String>> contacts = new ArrayList<>();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n--- CONTACT MANAGEMENT ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine();

                if (choice == 1) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    contacts.add(new Contact<>(name, phone, email));
                    System.out.println("Contact added!");

                } else if (choice == 2) {
                    System.out.println("\nContact List:");
                    for (Contact<String> c : contacts) {
                        c.display();
                    }

                } else if (choice == 3) {
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (Contact<String> c : contacts) {
                        if (c.getName().equalsIgnoreCase(search)) {
                            c.display();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Contact not found!");
                    }

                } else if (choice == 4) {
                    System.out.print("Enter name to delete: ");
                    String del = sc.nextLine();

                    Iterator<Contact<String>> it = contacts.iterator();
                    boolean removed = false;

                    while (it.hasNext()) {
                        Contact<String> c = it.next();
                        if (c.getName().equalsIgnoreCase(del)) {
                            it.remove();
                            removed = true;
                        }
                    }

                    if (removed) {
                        System.out.println("Contact deleted!");
                    } else {
                        System.out.println("Contact not found!");
                    }

                } else if (choice == 5) {
                    System.out.println("Exiting...");

                } else {
                    System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter number only.");
                sc.nextLine(); // clear wrong input
            } catch (Exception e) {
                System.out.println("Error occurred!");
            }
        }

        sc.close();
    }
}