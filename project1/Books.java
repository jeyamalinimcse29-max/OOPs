import java.util.*;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of books:");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] b = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Book " + (i + 1));

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Book name: ");
            String name = sc.nextLine();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            System.out.print("Enter number of copies: ");
            int copies = sc.nextInt();

            System.out.print("Enter rating: ");
            int rating = sc.nextInt();

            System.out.print("Enter number of pages: ");
            int page = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter category: ");
            String cat = sc.nextLine();

            System.out.print("Enter publication: ");
            String pub = sc.nextLine();

            System.out.print("Enter price: ");
            int price = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter the language: ");
            String lang = sc.nextLine();

            System.out.print("Enter year: ");
            int yr = sc.nextInt();
            sc.nextLine();

            b[i] = new Book(id, name, author, copies, rating, page, cat, lang, price, yr, pub);
        }

        System.out.println("\nLibrary Book Details");

        for (int i = 0; i < n; i++) {
            b[i].display();
        }

        sc.close();
    }
}

class Book {
    int id;
    String name;
    String author;
    int copies;
    int rating;
    int page;
    String cat;
    String lang;
    String pub;
    int price;
    int yr;

    Book(int id, String name, String author, int copies, int rating,
         int page, String cat, String lang, int price, int yr, String pub) {

        this.id = id;
        this.name = name;
        this.author = author;
        this.copies = copies;
        this.rating = rating;
        this.page = page;
        this.cat = cat;
        this.lang = lang;
        this.price = price;
        this.pub = pub;
        this.yr = yr;
    }

    void display() {
        System.out.println("\nBook ID: " + id);
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + copies);
        System.out.println("Rating: " + rating);
        System.out.println("No. of pages: " + page);
        System.out.println("Category: " + cat);
        System.out.println("Price: " + price);
        System.out.println("Language of the book: " + lang);
        System.out.println("Year of publication: " + yr);
        System.out.println("Publication: " + pub);
    }
}
