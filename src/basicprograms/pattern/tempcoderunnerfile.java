public class hollowButterfly {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (((i == 3) && (j == 2)) || ((i == 4) && (j == 2)) || ((i == 4) && (j == 3)) || ((i == 5) && (j == 2))
                        || ((i == 5) && (j == 3)) || ((i == 5) && (j == 4))) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (((i == 3) && (j == 2)) || ((i == 4) && (j == 2)) || ((i == 4) && (j == 3)) || ((i == 5) && (j == 2))
                        || ((i == 5) && (j == 3)) || ((i == 5) && (j == 4))) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();

        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (((i == 3) && (j == 2)) || ((i == 4) && (j == 2)) || ((i == 4) && (j == 3)) || ((i == 5) && (j == 2))
                        || ((i == 5) && (j == 3)) || ((i == 5) && (j == 4))) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (((i == 3) && (j == 2)) || ((i == 4) && (j == 2)) || ((i == 4) && (j == 3)) || ((i == 5) && (j == 2))
                        || ((i == 5) && (j == 3)) || ((i == 5) && (j == 4))) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}