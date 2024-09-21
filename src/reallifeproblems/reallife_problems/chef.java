import java.util.Scanner;

public class chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        System.out.print("Enter Number of test cases : ");
        T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int N, A, B;
            System.out.print("Enter the Values for N A B : ");
            N = sc.nextInt();
            A = sc.nextInt();
            B = sc.nextInt();
            System.out.print("Enter the Binary String which refers the Interdistrict and Inter state Travel : ");
            String S = sc.next();
            char[] charArr = S.toCharArray();
            int c0 = 0;
            int c1 = 0;
            for(char l : charArr)
            System.out.print(l);
            for (int j = 0; j < N; j++) {
                if (charArr[j] == '1') {
                    c1++;
                } else
                    c0++;

            }
            System.out.println("Time reqired for inter district and inter state form fill up : " + (A * c0 + B * c1));
        }
    }
}