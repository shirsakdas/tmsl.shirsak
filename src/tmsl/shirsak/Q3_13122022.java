package tmsl.shirsak;

/*
Write a program in JAVA to show the multiples of 3 up to 30
*/
class Question3 {
    public static void main(String args[]) {
        int num = 1;
        System.out.println("The multiples of 3 upto 30 are:");
        while ((num * 3) <= 30) {
            System.out.printf("%d ", num * 3);
            num++;
        }
    }
}