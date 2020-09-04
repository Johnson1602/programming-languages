package cn.itcast.day07.demo01;

// 想要键盘输入就要import scanner类
import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input an integer
//        int num = sc.nextInt();
//        System.out.println("The input number is: " + num);
        // input a string
        String str = sc.next();
        System.out.println("The input string is: " + str);
    }

}
