package tmsl.shirsak;

public class LambdaRunnableInterface {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello World");
        runnable.run();
    }
}


