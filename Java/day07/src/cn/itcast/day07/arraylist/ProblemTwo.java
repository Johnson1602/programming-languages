package cn.itcast.day07.arraylist;

import java.util.ArrayList;

public class ProblemTwo {

    public static void main(String[] args) {
        Student stu1 = new Student("STU1", 20);
        Student stu2 = new Student("STU2", 21);
        Student stu3 = new Student("STU3", 22);
        Student stu4 = new Student("STU4", 23);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i).getName() + " is " + list.get(i).getAge() + " years old.");
        }
    }

}
