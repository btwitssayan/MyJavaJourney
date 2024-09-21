import java.util.Scanner;

class cp3_string{
    public static void main(String args[]){
        String name = new String("Sayan");
        String name1 = "sanu";
        System.out.println(name);
        System.out.print(name);
        System.out.printf(name);
        System.out.format(name);
        int a = 8;
        float g = 12.025f;
        System.out.printf("the value of a = %d and value of g is %6.2f",a,g);
        System.out.format("the value of a = %d and value of g is %f",a,g);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String aa = sc.next();// only take first word from a sentence;
       // String bb = sc.nextLine();// take the whole sentence as a input;
        System.out.println(aa);
       // System.out.println(bb);

    }
}