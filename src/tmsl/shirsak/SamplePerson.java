package tmsl.shirsak;
import java.util.Scanner;
public class SamplePerson {
    String name;    float height;    byte age;    long aadhaar;
    public void setName(String name){
        this.name = name;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }
    public String getName() {
        return name;
    }
    public float getHeight() {
        return height;
    }
    public byte getAge() {
        return age;
    }
    public long getAadhaar() {
        return aadhaar;
    }
    public void allInputs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        setName(sc.nextLine());
        System.out.println("What is your age?");
        setAge(sc.nextByte());
        System.out.println("What is your height?");
        setHeight(sc.nextFloat());
        System.out.println("What is your aadhaar?");
        setAadhaar(sc.nextLong());
    }

    public void allDisplay(){
        System.out.println("Your name is: "+getName());
        System.out.println("Your age is: "+getAge());
        System.out.println("Your height is: "+getHeight());
        System.out.println("Your aadhaar number is: "+getAadhaar());
    }

    public static void main(String[] args) {
        SamplePerson ob = new SamplePerson();
        ob.allInputs();
        ob.allDisplay();
    }
}
