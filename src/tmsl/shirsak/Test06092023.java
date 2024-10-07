package tmsl.shirsak;

import java.sql.SQLOutput;

class Super {
    public void display(){
        System.out.println("Method of Super Class");
    }
}

class Sub extends Super {

    public void display() {

        System.out.print("Overrided method of sub class");
    }
}
public class Test06092023 {
    public static void main(String[] args) {
        Super obj = new Sub();
        obj.display();

    }
}
