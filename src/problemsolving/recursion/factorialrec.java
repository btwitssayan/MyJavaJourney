import java.util.Scanner;

public class FactorialRec {
    int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FactorialRec ob = new FactorialRec();
        System.out.println(ob.factorial(n));
    }
}