package cn.itcast.day07.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ProblemOne {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            list.add(rand.nextInt(33) + 1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
