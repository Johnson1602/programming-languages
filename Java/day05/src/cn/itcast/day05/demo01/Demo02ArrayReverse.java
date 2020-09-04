package cn.itcast.day05.demo01;

public class Demo02ArrayReverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original array is: ");
        printArray(arr);

        /*
        Reverse array
        初始条件：int left = 0, right = arr.length - 1;
        条件判断：left < right;
        步进语句：left++, right--;
         */
        for (int left = 0, right = arr.length - 1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        System.out.println("Reversed array is: ");
        printArray(arr);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
