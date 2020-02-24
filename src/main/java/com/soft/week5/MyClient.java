package com.soft.week5;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/19
 */
public class MyClient extends MyAdapter {
    @Override
    public void methodA(String param) {
        System.out.println(param);
    }


    @Override
    public void methodD() {
        System.out.println("无参方法D");
    }
}
