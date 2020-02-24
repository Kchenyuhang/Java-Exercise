package com.soft.week3;

/**
 * @Author yhChen
 * @Description 单例模式——饱汉式
 * @Date 2020/2/16
 */
public class Singleton {
    private static Singleton singleton = null;
    private Singleton() {

    }

    public static Singleton getSingletonInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
