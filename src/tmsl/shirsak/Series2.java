package tmsl.shirsak;/* This Series prints the sum of square of all numbers from 1 to 20
   1 + 4 + 9 + .............. + 400
*/

class Series2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i * i;
        }
        System.out.print("The Sum of Series: " + sum);
    }
}