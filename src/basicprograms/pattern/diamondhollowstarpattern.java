public class DiamondhollowStarPattern {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 2 && j == 2 || i == 3 && j >= 2 && j <= 4 || i == 4 && j >= 2 && j <= 6
                        || i == 5 && j >= 2 && j <= 8) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 2 && j == 2 || i == 3 && j >= 2 && j <= 4 || i == 4 && j >= 2 && j <= 6) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }

    }
}
