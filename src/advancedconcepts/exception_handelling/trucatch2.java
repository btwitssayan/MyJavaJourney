public class TruCatch2 {
    public static void main(String[] args) {
        int [] arr = {0};
        int b = 5;
        try{
            for(int i = 0;i<arr.length;i++){
                System.out.println(arr[i]/b);
            }
        }catch(Exception e){
            System.out.println("We fail to divide , Reason : "+e);
        }
    }
}
