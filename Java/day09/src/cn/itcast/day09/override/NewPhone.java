package cn.itcast.day09.override;

public class NewPhone extends Phone {

    @Override
    public void show() {
        super.show();
        System.out.println("Show name!");
        System.out.println("Show Avatar");
    }
}
