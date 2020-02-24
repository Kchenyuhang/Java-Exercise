package com.soft.week3;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/13
 */
public interface Fly {
//    /**
//     * 无参
//     */
//    void fly();
//
//    /**
//     * 代参
//     *
//     * @param speed speed
//     */
//    void fly(double speed);

    /**
     * 两个参数
     * @param speed speed
     * @param weather weather
     */
    void fly(double speed,String weather);
}