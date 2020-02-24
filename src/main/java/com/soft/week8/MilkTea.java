package com.soft.week8;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/21
 */
public class MilkTea extends Goods {
    private Drink drink;

    public MilkTea(Drink drink) {
        super();
        this.drink = drink;
    }

    @Override
    public void buyDrink() {
        drink.buyDrink();
        milkASugar();
    }

    /**
     * 购买奶茶A，加糖，价格12.00
     */
    public void milkASugar() {
        System.out.println("购买奶茶A");
        System.out.println("加糖");
        System.out.println("价格:12.00");
    }
}
