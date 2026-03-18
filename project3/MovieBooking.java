import java.util.*;

public class MovieBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> shows = new HashMap<>();
        shows.put("Morning", 10);
        shows.put("Afternoon", 10);
        shows.put("Evening", 10);

        HashMap<String, String> bookings = new HashMap<>();

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n--- MOVIE TICKET BOOKING ---");
            System.out.println("1. View Shows");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Customers");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("\nAvailable Shows:");
                for (String show : shows.keySet()) {
                    System.out.println(show + " - Seats: " + shows.get(show));
                }

            } else if (choice == 2) {
                System.out.print("Enter customer name: ");
                String name = sc.nextLine();

                System.out.print("Enter show (Morning/Afternoon/Evening): ");
                String show = sc.nextLine();

                if (shows.containsKey(show) && shows.get(show) > 0) {
                    shows.put(show, shows.get(show) - 1);
                    bookings.put(name, show);
                    System.out.println("Ticket booked successfully!");
                } else {
                    System.out.println("No seats available or invalid show!");
                }

            } else if (choice == 3) {
                System.out.print("Enter customer name: ");
                String name = sc.nextLine();

                if (bookings.containsKey(name)) {
                    String show = bookings.get(name);
                    shows.put(show, shows.get(show) + 1);
                    bookings.remove(name);
                    System.out.println("Ticket cancelled!");
                } else {
                    System.out.println("No booking found!");
                }

            } else if (choice == 4) {
                System.out.println("\nCustomer Bookings:");
                for (String customer : bookings.keySet()) {
                    System.out.println(customer + " -> " + bookings.get(customer));
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