class A {
    // A(int a, int b) {

    // }
    public void foo() {
        System.out.println("Inside Foo method of class A");

    }

}

class B extends A {
    @Override
    public void foo() {
        System.out.println("Inside Foo method of class B");

    }
}

public class TightCoupling {
    public static void main(String[] args) {
        B obj = new B();
        obj.foo();
    }
}