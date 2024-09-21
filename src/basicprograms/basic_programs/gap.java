import java.util.Scanner;

public class gap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting value: ");
        int startingValue = scanner.nextInt();

        System.out.print("Enter the gap: ");
        int gap = scanner.nextInt();

        System.out.println("Generated series:");
        for (int i = startingValue; i <= 15; i += gap) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
