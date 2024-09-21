interface Printable {
    void printing();
}

interface Showable {
    void showing();
}

class A2 implements Printable, Showable {
    public void printing() {
        System.out.println("Print Something !");
    }

    public void showing() {
        System.out.println("Show Something !");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        // A2 A = new A2();
        // // Printable b = new Printable(); Not Allowed
        // A.printing();
        // A.showing();

        Printable b = new A2();
        b.printing();

    }
}
