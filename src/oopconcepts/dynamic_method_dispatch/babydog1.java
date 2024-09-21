class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("dog is eating...");
    }
}

class BabyDog1 extends Dog {
    @Override
    void eat() {
        System.out.println("Babydog is eating...");
    }
    public static void main(String args[]) {
        Animal a = new BabyDog1();
        a.eat();
    }
}
