interface printable{
    void printsomething();
}

class printsome implements printable{
    public void printsomething(){
        System.out.println("Hello !");
    }
}

public class test {

    public static void main(String[] args) {
        printsome p = new printsome();
        p.printsomething();
    }
}