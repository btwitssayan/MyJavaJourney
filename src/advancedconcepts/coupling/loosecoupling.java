interface couple {
    void foo();
}

class A implements couple {
    A(int a, int b) {

    }

    @Override
    public void foo() {
        System.out.println("Inside Foo method of class A");

    }

}

class B implements couple {
    @Override
    public void foo() {
        System.out.println("Inside Foo method of class B");

    }
}

public class LooseCoupling {
    public static void main(String[] args) {
        couple obj = new B();
        obj.foo();
    }
}