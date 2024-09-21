// Define the Vehicle interface
interface Vehicle {
    // Methods to be implemented by classes that implement the interface
    void changeGear(int gear);

    void speedUp(int speed);

    void applyBreak(int reduceSpeed);

    void printState();

    default void state() {
        System.out.println("Vehicle is Running....");
    }
}

// Implement the Bicycle class that implements the Vehicle interface
class Bicycle implements Vehicle {
    int speed = 0; // Default speed
    int gear = 0; // Default gear

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int speed) {
        this.speed += speed;
    }

    @Override
    public void applyBreak(int reduceSpeed) {
        this.speed -= reduceSpeed;
    }

    @Override
    public void printState() {
        System.out.println("Speed of Bicycle is " + speed + " in " + gear + "th gear");
    }
}

// Implement the Bike class that also implements the Vehicle interface
class Bike implements Vehicle {
    int speed = 0; // Default speed
    int gear = 0; // Default gear

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void speedUp(int speed) {
        this.speed += speed;
    }

    @Override
    public void applyBreak(int reduceSpeed) {
        this.speed -= reduceSpeed;
    }

    @Override
    public void printState() {
        System.out.println("Speed of Bike is " + speed + " in " + gear + "th gear");
    }
}

public class TwoWheeler {
    public static void main(String[] args) {
        // Create a Bicycle object and demonstrate its functionality
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(1);
        bicycle.speedUp(10);
        bicycle.applyBreak(3);
        bicycle.printState();
        bicycle.state();

        // Create a Bike object and demonstrate its functionality
        Bike bike = new Bike();
        bike.changeGear(2);
        bike.speedUp(20);
        bike.applyBreak(5);
        bike.printState();
        bike.state();
    }
}
