package cn.itcast.day08.string;

import java.util.Scanner;

public class ProblemTwo {

    public static void main(String[] args) {
        System.out.println("Please enter something: ");
        String str = new Scanner(System.in).next();
        int[] result = countNumber(str);
        System.out.println("Uppercase: " + result[0]);
        System.out.println("Lowercase: " + result[1]);
        System.out.println("Number: " + result[2]);
        System.out.println("Other: " + result[3]);
    }

    public static int[] countNumber(String str) {
        int[] result = new int[4];
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                result[0]++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                result[1]++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                result[2]++;
            } else {
                result[3]++;
            }
        }

        return result;
    }

}
