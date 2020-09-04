package cn.itcast.day09.redpacket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    public void receiveRedPacket(ArrayList<Integer> redPacket) {
        // 随便抽一个红包，把得到的金额加到自己的余额中
        int index = new Random().nextInt(redPacket.size());
        int credit = redPacket.remove(index);
        super.setBalance(super.getBalance() + credit);
    }

}
