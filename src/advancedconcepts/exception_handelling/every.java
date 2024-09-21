import java.util.Scanner;

class NegException extends Exception {
    @Override
    public String toString() {
        return "Marks can't be negative!";
    }
}

class OutOfException extends Exception {
    @Override
    public String toString() {
        return "Marks can't be out of hundred!";
    }
}

public class every {
    public static void check(int v) throws NegException {
        if (v < 0) {
            throw new NegException();
        }
    }

    public static void check1(int v) throws OutOfException {
        if (v > 100) {
            throw new OutOfException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];
        System.out.println("Enter Marks:");

        for (int i = 0; i < 3; i++) {
            try {
                marks[i] = sc.nextInt();
                check(marks[i]);
                check1(marks[i]);
            } catch (NegException e) {
                System.out.println(e);
                break;
            } catch (OutOfException e) {
                System.out.println(e);
                break;
            }
        }

        sc.close();
        System.out.println("Ended");
    }
}

