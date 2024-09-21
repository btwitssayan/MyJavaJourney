public class rectangleOf_1010 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i + n - 1; j++) {
                System.out.print(j%2+ " ");
            }
            System.out.println();
        }
    }
}

