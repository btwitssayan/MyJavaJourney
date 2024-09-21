import java.util.Scanner;

public class series_of_hollow_pyramid_horizontal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Lines : ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && i % 4 != 0) {
                System.out.println("    *");
            } else if (i % 2 != 0) {
                System.out.println("  *");
            } else if (i == 0 || i % 4 == 0) {
                System.out.println("*");
            }
        }
    }
}
