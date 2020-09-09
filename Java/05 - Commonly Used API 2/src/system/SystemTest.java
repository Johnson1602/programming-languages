package system;

public class SystemTest {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SystemTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        /*
        System.out.println("Start!");
        System.exit(0);
        System.out.println("End!");
         */

        /*
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Ends in: " + (end - start) + " ms");
         */

        SystemTest st = new SystemTest();
        st.setAge(23);
        st.setName("Johnson");
        System.out.println(st);
    }
}
