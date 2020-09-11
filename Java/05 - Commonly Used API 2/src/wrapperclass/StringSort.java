package wrapperclass;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

//        1. 将字符串拆开存入字符串数组
        String[] arrString = s.split(" ");

//        2. 将字符串数组转化为 int 数组
        int[] arr = new int[arrString.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrString[i]);
        }

//        3. 对 int 数组进行排序
        Arrays.sort(arr);

//        4. 将排好序的数组转成字符串
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result.append(arr[i]);
            } else {
                result.append(arr[i]).append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
