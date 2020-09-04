package cn.itcast.day08.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemOne {

    public static void main(String[] args) {
        System.out.println("Please input random string: ");
        String str = new Scanner(System.in).next();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

}
