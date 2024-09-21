import java.util.Scanner;

// Custom exception class OverrideException1
class OverrideException1 extends Exception {
    // Override the toString() method to provide a custom error message
    @Override
    public String toString() {
        return "Length of the side of a Square can't be Negative or Zero!...";
    }
}

// Class for calculating the area of a square
class AreaOfSquare {
    // Static method to calculate the area of a square
    public static int SquareArea(int side) throws OverrideException1 {
        if (side < 1) {
            // If the side length is less than 1, throw a custom exception
            throw new OverrideException1();
        }
        // Calculate and return the area of the square
        int area = side * side;
        return area;
    }
}

public class MyExceptionWithFunction {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of a side of a square
        System.out.print("Enter the Length of a Side of A Square : ");

        // Read the side length from the user
        int side = sc.nextInt();

        try {
            // Call the SquareArea method to calculate the area of the square
            int area = AreaOfSquare.SquareArea(side);

            // Print the calculated area of the square
            System.out.println("Area of the Square : " + area);
        } catch (OverrideException1 e) {
            // Catch the custom exception if the side length is invalid and print the error
            // message
            System.err.println(e);
        } finally {
            sc.close();
            System.out.println("Program is ended");
        }
    }
}
