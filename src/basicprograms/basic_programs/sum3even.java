import java.util.Scanner;

public class sum3even {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The range : ");
        int z = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0, count = 0;
        for(int i = z;i<=n;i++){
            if(i%2==0){
                sum += i;
                count++;
            }
            if(count == 3){
                break;
            }
        }
        System.out.print("Sum = "+sum);
    }
}
