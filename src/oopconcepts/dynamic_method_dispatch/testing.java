class Phone{
    public void Greet(){
        System.out.println("Welcome !");
    }
    public void on(){
        System.out.println("Turning on Phone .");
    }
}

class SmartPhone extends Phone{
    public void Swgaat(){
    System.out.println("Apka Swagaat Hai !");
    }
    public void on(){
        System.out.println("Turning on SmartPhone .");
    }
}

public class Testing{
    public static void main(String[] args) {
        Phone obj = new SmartPhone();//Allowed
        //SmartPhone obj1 = new Phone();// not Allowed

        obj.Greet();
        obj.on();
    }
}