
class Demo {

    Demo() {
        System.out.println("Object is created");
    }

    void show() {
        System.out.println("Object is being used");
    }
}

public class Practical7 {

    public static void main(String[] args) {

        Demo d = new Demo();

        d.show();

        d = null;

        System.out.println("Object reference removed");

        System.gc();

        System.out.println("Garbage collection requested");
    }
}
