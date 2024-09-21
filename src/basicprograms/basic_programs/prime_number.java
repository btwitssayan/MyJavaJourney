import java.util.Scanner;

 class cat{
      static boolean Isprime(int n){
        for (int i = 2;i<Math.sqrt(n);i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
      }

}

public class prime_number {
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1;i<=n;i++){
            if (n%i==0){
                count ++;
            }
        }
        if (count == 2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Prime numbers up to " + num + " are: ");
        for(int i = 2; i <= num; i++) {
            if(cat.Isprime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

