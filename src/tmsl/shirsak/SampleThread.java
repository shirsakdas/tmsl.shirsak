package tmsl.shirsak;

public class SampleThread {
    public static void main(String[] args) {
        threadrun1 tr1 = new threadrun1();
        threadrun2 tr2 = new threadrun2();
        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        t1.start();
        t2.start();
    }
}

class threadrun1 implements Runnable{
    public void run(){
        int i=0;
        while(i<10) {
            System.out.println("Running Thread 1");
            i++;
        }
    }
}

class threadrun2 implements  Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<10) {
            System.out.println("Running Thread 2");
            i++;
        }
    }
}
