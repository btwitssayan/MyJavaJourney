import java.util.*;

public class adult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        if(v>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not adult");
        }
    }
}
