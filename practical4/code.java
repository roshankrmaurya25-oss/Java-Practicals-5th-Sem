

class Calculator {

    // Method overloading: different number of arguments
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading: different types of arguments
    double add(double a, double b) {
        return a + b;
    }
}

// Base class
class Employee {
    double calculatePay() {
        return 0.0;
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {
    double calculatePay() {
        return 30000 + 5000; // Salary + allowance
    }
}

// Derived class 2
class PartTimeEmployee extends Employee {
    double calculatePay() {
        return 500 * 40; // Hourly rate * hours worked
    }
}

public class Main {
    public static void main(String[] args) {

        // Method overloading
        Calculator c = new Calculator();

        System.out.println("Sum of 2 integers: " + c.add(10, 20));
        System.out.println("Sum of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + c.add(5.5, 4.5));

        // Method overriding
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time pay: " + e.calculatePay());
    }
}
