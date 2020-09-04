package cn.itcast.day06.person;

public class UsePerson {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.setAge(23);
        person1.setMale(true);
//        person1.show();
        System.out.println("Age: " + person1.getAge());
//        System.out.println("Male: " + person1.isMale());
    }

}
