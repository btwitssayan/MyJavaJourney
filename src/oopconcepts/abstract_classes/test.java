abstract class Phone{
    abstract void ringtone();
}

class Realme extends Phone{
    @Override
    void ringtone(){
        System.out.println("Ting Ting");
    }
}

class OnePlus extends Phone {
    @Override
    void ringtone(){
        System.out.println("tut tu tu");
    }
}

abstract class redmi extends Phone{
    void blast(){
        System.out.println("Boooooooom");
    }
}

public class test {
    public static void main(String[] args) {
       // Phone p1 = new Phone(); --error
        Phone p = new Realme();
        p.ringtone();

        
    }
}