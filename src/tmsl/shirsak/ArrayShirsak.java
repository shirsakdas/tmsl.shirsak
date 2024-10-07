package tmsl.shirsak;

import java.util.Scanner;
public class ArrayShirsak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter element no %d: ",(i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Target number found in the array at index " + i);
                found = true;
                break;
            }
            int sum = arr[i];
            for (int j = i + 1; j < size; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.print(target + " can be obtained as the sum of ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println(target + " cannot be obtained as the sum of any numbers in the array");
        }
    }
}