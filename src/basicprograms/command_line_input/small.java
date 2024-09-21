public class small {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int small = 0;
        if(a < b && a < c){
            small = a;
        }else{
            if(b<a && b<c){
                small = b;
            }else
             small = c;
        }
        System.out.print("Smallest among three Number : "+small);

    }
}
