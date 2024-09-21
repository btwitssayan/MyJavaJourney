import java.util.Scanner;

class Division {
    // Method to divide two integers and return the result
    double divide(int a, int b) {
        return a / b;
    }
}

public class ExceptionWithFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two Number : ");
        int a = sc.nextInt(); // Read the first integer from the user
        int b = sc.nextInt(); // Read the second integer from the user

        try {
            System.out.println("Division Process Started....");
            Division d1 = new Division();
            System.out.println("Result : " + d1.divide(a, b)); // Call the divide method and display the result
            System.out.println("Division Succesfull ...");
        } catch (NullPointerException e) {
            // Handle ArithmeticException if it occurs (e.g., division by zero)
            System.err.println("Exception Occured : " + e);
        } finally {
            sc.close(); // Close the Scanner to release resources
            System.out.println("Program is Ended....");
        }
    }
}
