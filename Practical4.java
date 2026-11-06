
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
}

// Base Class
class Employee {

    double calculatePay() {
        return 0;
    }
}

// First Derived Class
class FullTimeEmployee extends Employee {

    double calculatePay() {
        return 30000 + 5000;
    }
}

// Second Derived Class
class PartTimeEmployee extends Employee {

    double calculatePay() {
        return 10000 + 2000;
    }
}

// Main Class
public class Practical4 {

    public static void main(String[] args) {

        // Method Overloading
        Calculator c = new Calculator();

        System.out.println("Method Overloading:");

        System.out.println("Addition of two integers: " + c.add(10, 20));

        System.out.println("Addition of three integers: " + c.add(10, 20, 30));

        System.out.println("Addition of decimal numbers: " + c.add(10.5, 20.5));

        // Method Overriding
        System.out.println("\nMethod Overriding:");

        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full Time Employee Pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part Time Employee Pay: " + e.calculatePay());
    }
}
