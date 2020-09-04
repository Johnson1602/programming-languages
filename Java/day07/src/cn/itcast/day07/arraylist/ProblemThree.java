package cn.itcast.day07.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ProblemThree {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("HELLO");
        list.add("I'M");
        list.add("JOHNSON");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }

}
