import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 87 };
        Scanner sc = new Scanner(System.in);
        Boolean a = true;
        while (a) {
            System.out.println("Enter Array Index : ");
            int ind = sc.nextInt();
            System.out.println("Enter a number to divide with  : ");
            int num = sc.nextInt();
            try {
                System.out.println("Array Value of the Index " + ind + " is " + arr[ind]);
                try {
                    System.out.println("Result of the Division : " + arr[ind] / num);
                    a = false;

                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception Occured ...");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException Occured ...");
            }

        }
    }
}
