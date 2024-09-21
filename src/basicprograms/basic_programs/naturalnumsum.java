import java.util.Scanner;

public class naturalnumsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int sum =0;
        for(int i=1;i<=ch;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
