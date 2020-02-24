package com.soft.week7;

/**
 * @Author yhChen
 * @Description 志愿者类
 * @Date 2020/2/21
 */
public class Person implements Student {

    @Override
    public void doSomething() {
        System.out.println("志愿者们不辞劳苦，终于布置完场地！");
    }
}
