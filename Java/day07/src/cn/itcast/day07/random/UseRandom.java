package cn.itcast.day07.random;

import java.util.Random;

public class UseRandom {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();
        System.out.println("Random number: " + num);
    }

}
