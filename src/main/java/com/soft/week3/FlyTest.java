package com.soft.week3;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/13
 */
public class FlyTest {
    public static void main(String[] args) {
        Fly fly = (speed, weather) -> {
            System.out.println("天气：" + weather + ",飞行时速：" + speed);
        };
        fly.fly(555.5,"晴天");

    }
}
