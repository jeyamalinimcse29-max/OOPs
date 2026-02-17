import java.util.*;

public class Sol2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Beauty[] p = new Beauty[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Beauty Product " + (i + 1));

            System.out.println("Enter the product id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the product name:");
            String ptname = sc.nextLine();

            System.out.println("Enter the brand:");
            String brand = sc.nextLine();

            System.out.println("Enter the category:");
            String cat = sc.nextLine();

            System.out.println("Enter the Skintype:");
            String skinType = sc.nextLine();

            System.out.println("Enter country:");
            String madein = sc.nextLine();

            System.out.println("Enter the rating:");
            int rating = sc.nextInt();

            System.out.println("Enter price:");
            double price = sc.nextDouble();

            System.out.println("Enter the quantity:");
            int qty = sc.nextInt();
            sc.nextLine();

            p[i] = new Beauty(id, ptname, brand, cat, skinType, madein, rating, price, qty);
        }

        System.out.println("\nBeauty Product Details");

        for (int i = 0; i < n; i++) {
            p[i].print();
        }

        sc.close();
    }
}

class Beauty {
    int id;
    String ptname;
    String brand;
    String cat;
    String skinType;
    String madein;
    int rating;
    double price;
    int qty;

    Beauty(int id, String ptname, String brand, String cat,
           String skinType, String madein, int rating,
           double price, int qty) {

        this.id = id;
        this.ptname = ptname;
        this.brand = brand;
        this.cat = cat;
        this.skinType = skinType;
        this.madein = madein;
        this.rating = rating;
        this.price = price;
        this.qty = qty;
    }

    void print() {
        System.out.println("\nProduct ID: " + id);
        System.out.println("Product name: " + ptname);
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + cat);
        System.out.println("Skin Type: " + skinType);
        System.out.println("Made in: " + madein);
        System.out.println("Rating: " + rating + " stars");
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
    }
}
