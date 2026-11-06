
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Fax {
    void sendFax();
}

// Multiple Inheritance
class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printer is printing a document");
    }

    public void scan() {
        System.out.println("Printer is scanning a document");
    }
}

// Base Class
class Machine {

    void start() {
        System.out.println("Machine is starting");
    }
}

// Hybrid Inheritance
class SmartPrinter extends Machine implements Printable, Fax {

    public void print() {
        System.out.println("Smart Printer is printing");
    }

    public void sendFax() {
        System.out.println("Smart Printer is sending fax");
    }
}

// Main Class
public class Practical3 {

    public static void main(String[] args) {

        // Multiple Inheritance
        System.out.println("Multiple Inheritance:");

        AllInOnePrinter p = new AllInOnePrinter();

        p.print();
        p.scan();

        // Hybrid Inheritance
        System.out.println("\nHybrid Inheritance:");

        SmartPrinter s = new SmartPrinter();

        s.start();
        s.print();
        s.sendFax();
    }
}
