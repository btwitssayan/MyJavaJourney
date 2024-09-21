import java.util.Scanner;

public class factorial {
    public static int Factorial(int n){
        if (n <= 1){
            return 1;
        }else {
            return n * Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.println(Factorial(num));

    }
}
