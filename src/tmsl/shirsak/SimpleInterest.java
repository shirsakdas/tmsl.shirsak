package tmsl.shirsak;/*WAP in Java to find Simple Interest using Principal, Rate, Time as inputs in Encapsulation */

import java.util.*;

class SimpleInterest {
    double Principal, Rate, Time;
    private double principal;
    private double rate;
    private double time;

    public static void main(String[] args) {
        SimpleInterest ob = new SimpleInterest();
        ob.inputs();
        ob.setData();
        ob.display();
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void inputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        Principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        Rate = sc.nextDouble();
        System.out.print("Enter Time: ");
        Time = sc.nextDouble();
        sc.close();
    }

    public void setData() {
        setPrincipal(Principal);
        setRate(Rate);
        setTime(Time);
    }

    public double calculate() {
        return principal * rate * time / 100;
    }

    public void display() {
        System.out.println("The Simple Interest is: " + calculate());
    }
}