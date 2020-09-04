package cn.itcast.day08.string;

public class StringClass {

    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";

        String[] splitedStr = str.split("bbb");

        for (int i = 0; i < splitedStr.length; i++) {
            System.out.println(splitedStr[i]);
        }

        System.out.println("================");

        String str2 = "xxx.yyy.zzz";
        String[] splitedStr2 = str2.split("\\.");
        for (int i = 0; i < splitedStr2.length; i++) {
            System.out.println(splitedStr2[i]);
        }

    }

}
