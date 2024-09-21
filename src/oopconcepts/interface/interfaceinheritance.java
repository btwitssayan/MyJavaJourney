interface Printable {
    void printing();
}

interface Showable extends Printable {
    void showing();
    int a = 5;
}

class A3 implements Showable {
    public void printing() {
        System.out.println("Print Something !");
    }

    public void showing() {
        System.out.println("Show Something !");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.printing();
        obj.showing(); // Allowed

        //obj.a = 45;// because it "a" is by default final variable in interface Showable
        System.out.println(obj.a);

        Showable obj1 = new A3();
        obj1.showing();// Allowed

        // Printable obj1 = new A3();
        // obj1.printing(); --- error
    }
}
