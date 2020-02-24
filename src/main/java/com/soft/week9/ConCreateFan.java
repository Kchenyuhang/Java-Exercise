package com.soft.week9;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/22
 */
public class ConCreateFan implements Fan{
    private String name;

    public ConCreateFan(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"的偶像刚刚说：" + message);
    }
}
