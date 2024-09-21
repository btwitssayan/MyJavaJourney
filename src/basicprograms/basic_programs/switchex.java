import java.util.*;

public class switchex {
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namasta");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Input");
        }
    }
}