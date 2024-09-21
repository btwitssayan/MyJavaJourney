public class TryCatch1{
    public static void main(String[] args) {
        int a = 9000;
        int b = 0;
       // int c = a/b;
       // System.out.println("The Result of Division is "+c);
        try {
            int c = a/b;
        System.out.println("The Result of Division is "+c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.print("We failed to Divide , Reason : " );
            System.out.println(e);
        }
       System.out.println("End of the Program !");
    }
} 