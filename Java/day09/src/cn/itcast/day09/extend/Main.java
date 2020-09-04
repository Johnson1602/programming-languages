package cn.itcast.day09.extend;

public class Main {

    public static void main(String[] args) {
        TestExtend testExtend = new TestExtend();
        testExtend.setNum(0);
        for (int i = 0; i < 5; i++) {
            testExtend.numAddOne();
        }
    }

}
