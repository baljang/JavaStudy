package chap_01;

import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;

public class _Quiz_01 {
    public static void main(String[] args) {
        String busNo = "상암08";
        int minute = 3;
        float distance = (float)1.2;

        System.out.println(busNo +"번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
