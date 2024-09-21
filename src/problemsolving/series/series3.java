import java.util.Scanner;

// /Write a program in Java to find the sum of the given series:

//S = a2 + a2 / 2 + a2 / 3 + …… + a2 / 10

public class series3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += Math.pow(a, 2) / i;

        }
        System.out.println("Sum = " + sum);
    }

}
