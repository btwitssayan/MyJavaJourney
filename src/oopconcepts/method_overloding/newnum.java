public class newnum {
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String args[]) {

        System.out.println("Add = " + add(10, 3));
        System.out.println("Add = " + add(10, 3.00f));
        System.out.println("Add = " + add(10.00, 3.00,415.00));

    }
}
