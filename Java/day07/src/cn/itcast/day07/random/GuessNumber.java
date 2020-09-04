package cn.itcast.day07.random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        int theNum = new Random().nextInt(100);

        while (true) {
            System.out.println("Please guess the number: ");
            int guess = new Scanner(System.in).nextInt();
            if (judgeNumber(theNum, guess)) {
                break;
            }
        }

        System.out.println("The number is: " + theNum);
    }

    public static boolean judgeNumber(int theNum, int guess) {
        if (theNum == guess) {
            System.out.println("Congratulations!");
            return true;
        } else if (theNum > guess) {
            System.out.println("Smaller than the answer!");
        } else {
            System.out.println("Bigger than the answer!");
        }
        return false;
    }

}
