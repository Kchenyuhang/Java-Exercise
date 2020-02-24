package com.soft.week6;

/**
 * @Author yhChen
 * @Description 创建真实对象类，即小明
 * @Date 2020/2/20
 */
public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}
