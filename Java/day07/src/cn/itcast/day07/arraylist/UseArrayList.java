package cn.itcast.day07.arraylist;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("HELLO");
        arrayList.add("I'M");
        arrayList.add("JOHNSON");
//        System.out.println(arrayList);
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList.remove(1);
        System.out.println(arrayList);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(7);
        intList.add(12);
        System.out.println(intList);
    }

}
