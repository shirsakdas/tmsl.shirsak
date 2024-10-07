package tmsl.shirsak;

public class PrimeTill100 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        for(int i=3;i<=100;i++){
            int count = 0;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    count = 1;
                    break;
                }
            }
            if(count==0)
                System.out.println(i);
        }
    }
}
