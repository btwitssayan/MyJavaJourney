class Thread10 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I Cook Food ...");
            System.out.println("happy");
            i++;
        }
    }
}

class Thread11 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I Eat Food...");
            System.out.println("sad");
            i++;
        }
    }
}

public class ThreadsUsingRunable {
    public static void main(String[] args) {
        Thread10 Spatula = new Thread10();
        Thread hand1 = new Thread(Spatula);

        Thread11 Spoon = new Thread11();
        Thread hand2 = new Thread(Spoon);

       hand1.start();
        hand2.start();

    }
}
