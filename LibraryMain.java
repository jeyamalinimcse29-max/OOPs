import java.util.*;

class Library {

    ArrayList<String> books = new ArrayList<>();
    ArrayList<String> borrowedBooks = new ArrayList<>();

    Library() {
        books.add("Java");
        books.add("Python");
        books.add("C++");
        books.add("HTML");
    }

    void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("\nNo books available.");
        } 
        else {
            System.out.println("\nAvailable Books:");

            for (String b : books) {
                System.out.println("- " + b);
            }
        }
    }

    void borrowBook(String name) throws Exception {

        if (books.contains(name)) {

            books.remove(name);
            borrowedBooks.add(name);

            System.out.println("Book borrowed successfully!");

        } 
        else {
            throw new Exception("Book not available!");
        }
    }

    void returnBook(String name) throws Exception {

        if (borrowedBooks.contains(name)) {

            borrowedBooks.remove(name);
            books.add(name);

            System.out.println("Book returned successfully!");

        } 
        else {
            throw new Exception("This book was not borrowed!");
        }
    }
}

public class LibraryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {

            try {

                System.out.println("\n===== LIBRARY MENU =====");
                System.out.println("1. View Books");
                System.out.println("2. Borrow Book");
                System.out.println("3. Return Book");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {

                    lib.viewBooks();
                }

                else if (choice == 2) {

                    sc.nextLine();

                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();

                    lib.borrowBook(name);
                }

                else if (choice == 3) {

                    sc.nextLine();

                    System.out.print("Enter book name: ");
                    String name = sc.nextLine();

                    lib.returnBook(name);
                }

                else if (choice == 4) {

                    System.out.println("Thank you!");
                    break;
                }

                else {

                    throw new Exception("Invalid choice!");
                }

            } 
            catch (InputMismatchException e) {

                System.out.println("Enter numbers only!");
                sc.nextLine();

            } 
            catch (Exception e) {

                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}