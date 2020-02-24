package com.soft.week7;

/**
 * @Author yhChen
 * @Description 测试
 * @Date 2020/2/21
 */
public class Client {
    public static void main(String[] args) {
        Student person = new Person();
        person = new AthleteA(person);
        person = new AthleteB(person);
        person.doSomething();
    }
}
