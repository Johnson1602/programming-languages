package cn.itcast.day08.staticlearn;

public class StaticField {

    public static void main(String[] args) {
        Student one = new Student("STU1", 18);
        Student two = new Student("STU2", 19);
        Student.classroom = 100;
//        System.out.println("Name: " + one.getName() +
//                ", age: " + one.getAge() +
//                ", classroom: " + Student.classroom +
//                ", student ID: " + one.getStudentId());
//        System.out.println("Name: " + two.getName() +
//                ", age: " + two.getAge() +
//                ", classroom: " + Student.classroom +
//                ", student ID: " + two.getStudentId());
        one.introduceMyself();
    }

}
