import java.util.Scanner;

public class NutsBolats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        String Nut;
        String Bolt;
        System.out.print("Enter Number of Nuts & Bolts : ");
        N = sc.nextInt();
        System.out.print("Enter Number of Nuts & Bolts : ");
        Nut = sc.next();
        Bolt = sc.next();
        char[] Nuts = Nut.toCharArray();
        char[] Bolts = Bolt.toCharArray();
        Arrays.sort(Nuts);
        Arrays.sort(Bolts);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Nuts[i] == Bolts[j]) {
                    System.out.print(Nuts[i] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Bolts[i] == Nuts[j]) {
                    System.out.print(Bolts[i] + " ");
                }
            }
        }

    }
}
