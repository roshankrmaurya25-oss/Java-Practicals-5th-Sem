
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    void displayCar() {
        displayVehicle(); // Inherited method
        System.out.println("Doors: " + doors);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 180, 4);

        c.displayCar();
    }
}

