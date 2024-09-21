import java.util.Scanner;

public class posandnegpatternandcheck {
    public static void main(String args[]){
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num >= 0){
            for(int i = 1;i<=3;i++){
                for(int j = 1;j<=5;j++){
                    if(i == 3&& j<=5||i<=2&&j==3){
                        System.out.print("*");
                    }else
                    System.out.print(" ");

                }
                System.out.println();
            }
            for(int i = 2;i>=1;i--){
                for(int j = 1;j<=5;j++){
                    if(i == 3&& j<=5||i<=2&&j==3){
                        System.out.print("*");
                    }else
                    System.out.print(" ");

                }
                System.out.println();
            }

        }else
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                if(i==3)
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
