package collections;
import map.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortStudents {
    public static void main(String[] args) {
//        创建 Arraylist 集合存储学生对象，按照年龄排序，年龄相同时按照姓名字母排序
//        1. 创建 Arraylist 集合
        ArrayList<Student> arrayList = new ArrayList<>();

//        2. 创建学生对象
        Student s1 = new Student("fengqingyang", 20);
        Student s2 = new Student("luzhishen", 17);
        Student s3 = new Student("zhouziyu", 34);
        Student s4 = new Student("hupo", 20);

//        3. 将学生对象添加到集合中
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

//        4. 使用 Collections 工具类对 Arraylist 进行排序
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int result = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return result;
            }
        });

//        5. 遍历集合
        for (Student s : arrayList) {
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
