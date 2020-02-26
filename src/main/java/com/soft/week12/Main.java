package com.soft.week12;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/26
 */
public class Main {
    public static void main(String[] args) {
        ComputerFactory.createComputer("hp").start();
        ComputerFactory.createComputer("asus").start();
    }
}
