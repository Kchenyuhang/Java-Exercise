package com.soft.week6;

/**
 * @Author yhChen
 * @Description 创建代理对象类，即代购
 * @Date 2020/2/20
 */
public class Proxy implements Subject {
    @Override
    public void buyMac() {
        //引用并创建真实对象实例
        RealSubject realSubject = new RealSubject();
        //调用真实对象的方法，对Mac进行包装
        this.WrapMc();
    }

    public void WrapMc() {
        System.out.println("用盒子包装好Mac");
    }
}
