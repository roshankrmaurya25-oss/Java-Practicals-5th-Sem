

class Demo {
    // Constructor
    Demo() {
        System.out.println("Object constructed.");
    }

    // Method to use the object
    void display() {
        System.out.println("Object is being used.");
    }

    // Method to demonstrate object reference removal
    static void createObject() {
        Demo obj = new Demo();
        obj.display();

        // Reference goes out of scope when this method ends
        System.out.println("Object reference will go out of scope.");
    }

    public static void main(String[] args) {
        createObject();

        // Request garbage collection
        System.out.println("Requesting garbage collection...");
        System.gc();

        System.out.println("End of program.");
    }
}
