
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Single Inheritance
class Car extends Vehicle {
    String model = "Fortuner";

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Multilevel Inheritance
class Person {
    String name = "Rahul";

    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int salary = 30000;

    void showEmployee() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showManager() {
        System.out.println("Department: " + department);
    }
}

// Hierarchical Inheritance
class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

// Main Class
public class Practical2 {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("Single Inheritance:");

        Car c = new Car();
        c.start();
        c.displayCar();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");

        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");

        Circle cr = new Circle();
        cr.display();
        cr.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}
