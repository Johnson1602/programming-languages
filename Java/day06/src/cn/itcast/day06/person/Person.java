package cn.itcast.day06.person;

public class Person {

    // 成员变量
    String name;
    private int age; // 为了验证 age 的合法性，将其变成私有变量
    private boolean male; // male 是个变量名，存储的是 true / false

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    // 间接设置 age
    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("Invalid age!");
            return;
        }
        this.age = age;
    }

    // 间接获取 age
    public int getAge() {
        return age;
    }

    // 成员方法
    public void show() {
        System.out.println("I'm " + name + ", and I'm " + age + " years old.");
    }



}
