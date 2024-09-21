public class reverse2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");

        for(int i = 0;i<str.length()/2;i++){
            int f = i;
            int b = str.length()-i-1;

            char fch = str.charAt(f);
            char bch = str.charAt(b);

            str.setCharAt(f, bch);
            str.setCharAt(b, fch);

           
        }
        System.err.println(str);

    }
}
