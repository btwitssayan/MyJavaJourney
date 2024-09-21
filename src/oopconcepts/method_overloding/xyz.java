class Good {
    static void foo() {
        System.out.println("Good Morning!");
    }
}

class abc {
    private float pi = 3.14f;

    private float circum(int r) {
        return 2 * pi * r;
    }

    public float getPi() {
        return pi;
    }
}
class pqr{
    protected static int x = 5;
    protected static float circum(){

        return 2*3.14f*x; 

    }

}
public class xyz {
    public static void fd() {
        System.out.println("Cow !");
    }

    public static void main(String[] args) {
        System.out.println("good");
        Good.foo();
        fd();
        // abc ob = new abc();
        // System.out.println("Circumference: " + ob.circum(6)); // here it is not acessable because it is a private method;
        // System.out.println("Value of pi: " + ob.getPi());
        // System.out.println(ob.pi); // here it is not visible because it is a private field;
        // pqr ob1 = new pqr();
        // System.out.println(ob1.x);// because the protected can be accessible to the classes with in the same package of file;
        // System.out.printf("Result : %.2f",ob1.circum());
        System.out.println(pqr.x);
        System.out.println(pqr.circum());
    }
}
