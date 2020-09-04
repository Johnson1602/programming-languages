package cn.itcast.day08.string;

public class ProblemOne {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String result = fromArrayToString(arr);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                result += "word" + array[i] + "]";
            } else {
                result += "word" + array[i] + "#";
            }
        }
        return result;
    }

}
