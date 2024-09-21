public class copycons {
    int roll;
    String name;

    copycons(int roll, String name) {
        this.roll = roll;
        this.name = name;

    }

    copycons(copycons obj1) {
        this.roll = obj1.roll;
        this.name = obj1.name;

    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String args[]) {
        copycons ob1 = new copycons(56, "Sayan");
        copycons ob2 = new copycons(ob1);
        ob1.display();
        ob2.display();
    }
}