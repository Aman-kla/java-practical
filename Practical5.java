
class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber c) {
        int r = real + c.real;
        int i = imaginary + c.imaginary;

        return new ComplexNumber(r, i);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Practical5 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(10, 5);
        ComplexNumber c2 = new ComplexNumber(4, 3);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        ComplexNumber c3 = c1.add(c2);

        System.out.print("Sum of Complex Numbers: ");
        c3.display();
    }
}
