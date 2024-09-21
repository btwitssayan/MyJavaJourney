interface Bank{
    int interest();
}

class Sbi implements Bank{
    public int interest(){
        return 8;
    }
}

public class Test2 {
    public static void main(String[] args) {
        Sbi b = new Sbi();
        System.out.println(b.interest());

    }
}
