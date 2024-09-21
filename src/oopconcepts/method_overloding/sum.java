public class sum {
    // static int add(int a, int b) {
    //     return a + b;
    // }

    // static int add(int a, int b, int c) {
    //     return a + b + c;
    // }

    // static int add(int a, int b, int c, int d) {
    //     return a + b + c + d;
    // }
    static int add(int x,int ...arr){
        int r = 0;
        for (int i : arr) {
            r+=i;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 & 6 : " + add(5, 6));
        System.out.println("Sum of 4,8 & 5 : " + add(4, 8, 5));
        System.out.println("Sum of 5 , 7 , 2 & 6 : " + add(5, 7, 2, 6));
    }
}
