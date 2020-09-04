package cn.itcast.day09.redpacket;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> sendRedPacket(int money, int count) {
        // 创建个对象存分好的红包
        ArrayList<Integer> redPacket = new ArrayList<>();

        // 先看下有多少钱，判断红包发不发得出去
        int balance = super.getBalance();
        if (balance < money) {
            System.out.println("Not enough money! Send Fail!");
            return redPacket;
        }

        // 如果余额够的话，那就发红包，把发出去的钱从余额中扣掉
        super.setBalance(balance - money);
        int eachPacket = money / count;
        int left = money % count;
        for (int i = 0; i < (count - 1); i++) {
            redPacket.add(eachPacket);
        }
        redPacket.add(eachPacket + left);

        return redPacket;
    }

}
