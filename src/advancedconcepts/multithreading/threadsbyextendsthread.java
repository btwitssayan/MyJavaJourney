class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I am Cooking !....");
           // System.out.println("I am Sad...");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("I am Chating with Her !....");
           // System.out.println("I am Happy...");
            i++;
        }
    }
}

public class ThreadsByExtendsThread {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        th1.start();
        th2.start();

    }
}