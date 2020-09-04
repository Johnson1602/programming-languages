package cn.itcast.day05.demo01;

public class Demo01Array {
    public static void main(String[] args) {
        // 动态初始化
        int[] arrayA = new int[10];

        // 静态初始化标准格式
        int[] arrayB = new int[]{1, 2, 3};

        // 静态初始化省略模式
        int[] arrayC = {4, 5, 6};

        // 动态拆开写
        int[] arrayD;
        arrayD = new int[5];

        // 静态拆开写
        int[] arrayE;
        arrayE = new int[]{7, 8, 9};

//        for (int i = 0; i < arrayE.length; i++) {
//            System.out.println(arrayE[i]);
//        }

        for (int i = 0; i < arrayE.length; i++) {
            System.out.println(arrayE[i]);
        }

    }
}
