
class Book {
    String title;
    String author;
    double price;

    // 1. Default Constructor
    Book() {
        title = "Unknown";
        author = "Not Assigned";
        price = 0.0;
    }

    // 2. Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // 3. Copy Constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------");
    }
}

public class Practical6 {
    public static void main(String[] args) {

        // Default Constructor
        Book b1 = new Book();
        System.out.println("Default Constructor:");
        b1.display();

        // Parameterized Constructor
        Book b2 = new Book("C++ Programming",
                "Bjarne Stroustrup", 550);
        System.out.println("Parameterized Constructor:");
        b2.display();

        // Copy Constructor
        Book b3 = new Book(b2);
        System.out.println("Copy Constructor:");
        b3.display();

        // Modify copied object
        b3.title = "Java Programming";
        b3.price = 650;

        System.out.println("After Modifying Copied Object:");

        System.out.println("Original Object:");
        b2.display();

        System.out.println("Copied Object:");
        b3.display();
    }
}
