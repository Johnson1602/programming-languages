package cn.itcast.day04.demo01;

public class MethodOverload {
    public static void main(String[] args) {
//        System.out.println(getSum(1, 2));
//        System.out.println(getSum(1, 2, 3));
//        System.out.println(getSum(1, 2, 3, 4));

        int a = 1;
        char b = 'a';
        String c = "abc";
        String addString = b + c;
        System.out.println(addString);
    }

    // 求两个数的和
    public static int getSum(int a, int b) {
        return a + b;
    }

    // 求三个数的和
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    // 求四个数的和
    public static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
