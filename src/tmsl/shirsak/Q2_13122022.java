package tmsl.shirsak;

/*
Write a program in JAVA to print all the numbers from 1000 to 100,
excluding both the starting number and the ending number.
*/
class Question2 {

    public static void main(String args[]) {
        int num = 999;
        System.out.println("Numbers from 1000 to 100 excluding them are:");
        while (num > 100) {
            System.out.printf("%d ", num);
            num--;
        }
    }
}