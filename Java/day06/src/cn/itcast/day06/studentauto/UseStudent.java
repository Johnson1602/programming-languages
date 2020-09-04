package cn.itcast.day06.studentauto;

public class UseStudent {

    public static void main(String[] args) {
        cn.itcast.day06.student.Student student = new cn.itcast.day06.student.Student("John", 23);
        System.out.println("Name: " + student.getName() + ", age: " + student.getAge());
        Student student2 = new Student();
        student2.setName("Acacia");
        student2.setAge(21);
        System.out.println("Name: " + student2.getName() + ", age: " + student2.getAge());
    }

}
