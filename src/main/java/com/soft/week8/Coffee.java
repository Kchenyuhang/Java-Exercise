package com.soft.week8;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/21
 */
public class Coffee extends Goods {
    private Drink drink;

    public Coffee(Drink drink) {
        super();
        this.drink = drink;
    }

    @Override
    public void buyDrink() {
        drink.buyDrink();
        coffeeA();
    }

    /**
     * 购买咖啡A，不加糖，价格11.00
     */
    public void coffeeA() {
        System.out.println("购买咖啡A");
        System.out.println("不加糖");
        System.out.println("价格:11.00");
    }
}
