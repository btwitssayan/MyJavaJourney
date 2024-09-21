import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        String letter = "Dear <name> ,Thanks a lot!";
        System.out.print("Enter Your name : ");
        Scanner sc = new Scanner(System.in);
        String nm = sc.next();
        System.out.println(letter.replace("<name>", nm));
    }
}
