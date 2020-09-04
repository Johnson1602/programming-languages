package cn.itcast.day08.staticlearn;

public class Student {

    private String name;
    private int age;
    private int studentId;
    static int classroom;
    private static int idCounter = 1;

    public Student() {
        this.studentId = idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentId = idCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 成员方法
    public void introduceMyself() {
        System.out.println(this);
        System.out.println("Hello everyone, my name is: " + this.name + ", and I'm " + this.age + " years old.");
    }

    // 静态方法
    public static void introduction() {
//        System.out.println(this);
    }

}
