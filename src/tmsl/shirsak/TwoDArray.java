package tmsl.shirsak;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] arr = { { 39, 27, 11, 42 },
                        { 10, 93, 91, 90 },
                        { 54, 78, 56, 89 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rows = 2;
        int columns = 4;
        arr = new int[rows][columns];

        arr[0][0] = 7;
        System.out.println("arr[0][0] = " + arr[0][0]);

        System.out.println("Entering values in the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Printing values from the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}