package com.soft.week9;

/**
 * @Author yhChen
 * @Description 抽象明星类
 * @Date 2020/2/22
 */
public interface Idol {
    /**
     * 添加粉丝
     *
     * @param fan fan
     */
    void addFan(Fan fan);
    /**
     * 拉黑粉丝
     *
     * @param fan fan
     */
    void deFan(Fan fan);
    /**
     * 发布动态
     *
     * @param message message
     */
    void notify(String message);
}
