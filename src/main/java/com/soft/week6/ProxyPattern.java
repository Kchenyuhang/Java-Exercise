package com.soft.week6;

/**
 * @Author yhChen
 * @Description 客户端调用
 * @Date 2020/2/20
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Subject real = new RealSubject();
        real.buyMac();
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}
