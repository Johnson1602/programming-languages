package map;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
//        1. 创建 map 集合
        HashMap<Student, String> students = new HashMap<>();

//        2. 创建学生对象
        Student s1 = new Student("Student1", 18);
        Student s2 = new Student("Student2", 19);
        Student s3 = new Student("Student3", 20);
        Student s4 = new Student("Student3", 20);

//        3. 将学生对象 + 地址存储到 map 集合中
        students.put(s1, "江苏");
        students.put(s2, "云南");
        students.put(s3, "New York City");
        students.put(s4, "Long Island City");

//        4. 遍历 map 集合
//        方法一
        Set<Student> studentsSet = students.keySet();
        for (Student student : studentsSet) {
            String address = students.get(student);
            System.out.println(student.getName() + ", " + student.getAge() + ", " + address);
        }

    }
}
