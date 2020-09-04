package cn.itcast.day09.redpacket;

import java.util.ArrayList;

public class RedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 100);
        Member member1 = new Member("Member 1", 0);
        Member member2 = new Member("Member 2", 0);
        Member member3 = new Member("Member 3", 0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();

        System.out.println("==================");

        ArrayList<Integer> redPacket = manager.sendRedPacket(40, 3);
        member1.receiveRedPacket(redPacket);
        member2.receiveRedPacket(redPacket);
        member3.receiveRedPacket(redPacket);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }

}
