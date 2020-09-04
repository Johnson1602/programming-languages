package cn.itcast.day06.student;

public class UseStudent {

    public static void main(String[] args) {
        Student student = new Student("John", 23);
        System.out.println("Name: " + student.getName() + ", age: " + student.getAge());
        Student student2 = new Student();
        student2.setName("Acacia");
        student2.setAge(21);
        System.out.println("Name: " + student2.getName() + ", age: " + student2.getAge());
    }

}
