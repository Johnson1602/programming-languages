package stringbuilder;

public class StringFormatting {
    public static void main(String[] args) {
        // 格式化输出数组为 [1, 2, 3]
        int[] arr = {1, 2, 3};

        String s = format(arr);
        System.out.println("s: " + s);
    }

//    使用 StringBuilder 格式化字符串，参数为 int[] arr，返回值类型 String
    public static String format(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
