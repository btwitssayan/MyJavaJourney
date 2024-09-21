import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {
       int [] marks = {98,54,49};
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Index Number : ");
       int ind = sc.nextInt();
       System.out.print("Enter The Number you want to divide with : ");
       int num = sc.nextInt();
       try{
        System.out.println("Index value of "+ind+" is "+marks[ind]);
        System.out.println("Division Result "+marks[ind] /num );
       }catch(ArithmeticException e){
        System.out.println("ArithmeticException Occured !");
       }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("ArrayIndexOutOfBoundsException Occured !");
       }catch(Exception e){
        System.out.println("OtherException Occured !");
       }
    }
}
