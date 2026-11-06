
class Employee {
    String employeeName;
    double salary;

    // Static variable
    static int count = 0;

    // No-Argument Constructor
    Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized Constructor
    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;

        count++;
    }

    // Display Employee Details
    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }

    // Static Method
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }
}

// Main Class
public class Practical9 {
    public static void main(String[] args) {

        // Creating Employee Objects
        Employee e1 = new Employee();

        Employee e2 = new Employee("Rahul", 25000);

        Employee e3 = new Employee("Amit", 35000);

        Employee e4 = new Employee("Priya", 40000);

        // Display Employee Details
        System.out.println("===== Employee Details =====");

        e1.display();
        e2.display();
        e3.display();
        e4.display();

        // Display Total Employee Count
        System.out.println("===== Employee Count =====");

        Employee.displayCount();
    }
}
