package cn.itcast.day09.override;

public class UsePhone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("Old Phone");
        phone.call();
        phone.message();
        phone.show();

        System.out.println("================");

        System.out.println("New Phone");
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.message();
        newPhone.show();

    }

}
