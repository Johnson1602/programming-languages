package cn.itcast.day05.demo01;

public class Demo03ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(1, 2, 3);
        System.out.println("Sum is: " + result[0]);
        System.out.println("Avg is: " + result[1]);
    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return new int[]{sum, avg};
    }
}
