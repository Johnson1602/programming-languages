package cn.itcast.day07.demo01;

import java.util.Scanner;

public class ScannerSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int a = scanner.nextInt();
        System.out.println("Second number: ");
        int b = scanner.nextInt();
        System.out.println("Sum is: " + (a + b));
    }

}
