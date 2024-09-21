import java.util.*;

public class elseif_ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.println("Hello");
        }else if(ch == 2){
            System.out.println("Namasta");
        }else if(ch ==3){
            System.out.println("Bonjour");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
