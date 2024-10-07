package tmsl.shirsak;


abstract class Shirsak{
    public void name(){
        System.out.println("Shirsak");
    }

    abstract void organs();
}

class TCS extends Shirsak{
    @Override
    void organs(){
        System.out.println("Organs are not necessary for software programming");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Shirsak sc = new TCS();
        new TCS().organs();
    }
}
