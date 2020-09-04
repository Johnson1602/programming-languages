package cn.itcast.day07.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ProblemFour {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);

        ArrayList<Integer> result = selectEvenNumber(list);
        System.out.println(result);
    }

    public static ArrayList<Integer> selectEvenNumber(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

}
