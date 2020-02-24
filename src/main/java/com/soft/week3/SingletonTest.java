package com.soft.week3;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/16
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        System.out.println(s1 == s2);
    }
}
