import java.util.Scanner;

//Write a program in Java to find the sum of the given series:

//S = a + a2 / 2 + a3 / 3 + …… + a10 / 10

public class series4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=10;i++){
            sum += Math.pow(a, i)/i;
        }
        System.out.println("Sum = "+sum);
    }
    
}
