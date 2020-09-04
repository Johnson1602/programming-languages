package cn.itcast.day06;

public class Student {
    // 成员变量
    String name;
    int age;

    // 成员方法
    public void eat() {
        System.out.println("EAT!!!");
    }

    public void sleep() {
        System.out.println("SLEEP!!!");
    }

    public void study() {
        System.out.println("STUDY!!!");
    }

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();
    }

}
