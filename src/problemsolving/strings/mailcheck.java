import java.util.Scanner;

public class mailcheck {
    static String checkmail(String mail) {
        if (mail.contains("@gmail")) {
            return "It is a Mail ID and Index position of @ is " + mail.indexOf("@");
        } else
            return "It is not a Mail ID !";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Mail ID : ");
        String mail = sc.next();
        String result = checkmail(mail);
        System.out.println(result);

    }
}