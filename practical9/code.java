

class Employee {
    String employeeName;
    double salary;

    // Static variable shared by all objects
    static int employeeCount = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized constructor
    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;

        employeeCount++;
    }

    // Display employee details
    void display() {
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit", 30000);
        Employee e3 = new Employee("Priya", 45000);

        System.out.println("Employee 1:");
        e1.display();

        System.out.println("Employee 2:");
        e2.display();

        System.out.println("Employee 3:");
        e3.display();

        Employee.displayCount();
    }
}
