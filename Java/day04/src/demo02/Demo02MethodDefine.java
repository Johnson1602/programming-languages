package demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = sum(num1, num2);
//        int result2 = sum(5, 10);
        System.out.println("num1 + num2 = " + result);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
