

class Product {
    String productName;
    double price;
    int quantity;

    // 1. No-argument constructor
    Product() {
        productName = "Unknown";
        price = 0.0;
        quantity = 0;
    }

    // 2. Constructor with product name only
    Product(String productName) {
        this.productName = productName;
        price = 0.0;
        quantity = 0;
    }

    // 3. Constructor with product name and price
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        quantity = 0;
    }

    // 4. Constructor with all three fields
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate total cost
    double totalCost() {
        return price * quantity;
    }

    // Display product details
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println();
    }

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Notebook", 50.0);
        Product p4 = new Product("Bag", 800.0, 2);

        System.out.println("1. No-argument Constructor:");
        p1.display();

        System.out.println("2. Name-only Constructor:");
        p2.display();

        System.out.println("3. Name and Price Constructor:");
        p3.display();

        System.out.println("4. All-arguments Constructor:");
        p4.display();
    }
}
