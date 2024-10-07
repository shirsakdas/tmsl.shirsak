package tmsl.shirsak;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] arr, int num) {
        int[] array = {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    array = new int[]{arr[i], arr[j]};
                    return array;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] mainArray = {3, 2, 4};
        int num = 6;
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(mainArray, num)));
    }
}
