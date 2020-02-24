package com.soft.week9;

import java.util.ArrayList;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/22
 */
public class ConCreateIdol implements Idol{
    private ArrayList<Fan> fans;
    public ConCreateIdol() {
        this.fans = new ArrayList<Fan>();
    }
    /**
     * 粉丝关注
     * @param fan fan
     */
    @Override
    public void addFan(Fan fan) {
        fans.add(fan);
    }
    /**
     * 拉黑粉丝
     * @param fan fan
     */
    @Override
    public void deFan(Fan fan) {
        fans.remove(fan);
    }
    /**
     * 明星发布动态，通知所有自己的粉丝
     * @param message message
     */
    @Override
    public void notify(String message) {
        for (Fan fan : fans) {
            fan.update(message);
        }
    }
}
