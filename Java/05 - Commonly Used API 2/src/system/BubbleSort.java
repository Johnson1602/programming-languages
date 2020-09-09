package system;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("Before sort: " + arrToString(arr));

//        Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After sort: " + arrToString(arr));
        System.out.println("--------");

        int[] arr2 = {24, 69, 80, 57, 13};
        System.out.println("Before sort: " + Arrays.toString(arr2));
        Arrays.sort(arr2); // 用的是快排 DualPivotQuicksort
        System.out.println("After sort: " + Arrays.toString(arr2));

    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
