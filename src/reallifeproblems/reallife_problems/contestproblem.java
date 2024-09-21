import java.util.Scanner;

public class ContestProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SA, SB, SC;
        int T;
        T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            SA = sc.nextInt();
            SB = sc.nextInt();
            SC = sc.nextInt();

            String Result = (SA < SB && SA < SC) ? "Draw" : (SB < SA && SB < SC) ? "Bob" : "Alice";
            System.out.println(Result);
        }
    }
}
