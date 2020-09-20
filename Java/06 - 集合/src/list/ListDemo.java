package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
//        ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");

//        三种遍历方法
//        1. Iterator
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }
        System.out.println("--------");

//        2. for loop
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            System.out.println(s);
        }
        System.out.println("--------");

//        3. enhanced for
        for (String s : arrayList) {
            System.out.println(s);
        }
        System.out.println("--------");

//        LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
