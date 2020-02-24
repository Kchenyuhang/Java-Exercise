package com.soft.week8;

/**
 * @Author yhChen
 * @Description 测试
 * @Date 2020/2/21
 */
public class Client {
    public static void main(String[] args) {
        Drink westDrink = new WestDrink();
        westDrink = new MilkTea(westDrink);
        westDrink = new Coffee(westDrink);
        westDrink.buyDrink();
    }
}
