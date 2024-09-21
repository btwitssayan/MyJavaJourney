import java.util.Scanner;

class OverrideException extends Exception {
    @Override
    public String toString() {
        return "you can't Vote";
    }
}

public class MyException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new OverrideException();
            } else {
                System.out.println("you can Vote");
            }
        } catch (OverrideException e) {

            System.out.println("Some exception Occurs , Reason : ");
            System.out.println(e);
        }

    }
}
