package tmsl.shirsak;

public class Calculate{
    int num1, num2;
    public Calculate(int getNum1, int getNum2){
        num1 = getNum1;
        num2 = getNum2;
    }
    public void add(){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        Calculate obj = new Calculate(5,6);
//        obj.num1=5;
//        obj.num2=6;
        obj.add();
        Calculate obj1 = new Calculate(7,8);
//        obj1.num1=3;
//        obj1.num2=4;
//        Calculate obj1 = obj;
        obj1.add();
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
}