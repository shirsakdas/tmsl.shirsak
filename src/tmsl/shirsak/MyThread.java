package tmsl.shirsak;

public class MyThread extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.print(i + " Hello");
            i++;
        }
    }
}

class Test{
    public static void main(String[] args){
        Thread t = new MyThread();
        t.run();
        int i = 1;
        while (true) {
            System.out.print(i + " World");
            i++;
        }
    }
}