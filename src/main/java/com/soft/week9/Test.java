package com.soft.week9;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/22
 */
public class Test {
    public static void main(String[] args) {
        //创建一个具体的明星
        ConCreateIdol conCreateIdol = new ConCreateIdol();
        //创建三个具体的粉丝
        ConCreateFan xm = new ConCreateFan("小明");
        ConCreateFan xh = new ConCreateFan("小红");
        ConCreateFan xl = new ConCreateFan("小亮");
        //关注明星
        conCreateIdol.addFan(xm);
        conCreateIdol.addFan(xh);
        conCreateIdol.addFan(xl);
        //明星发布动态
        conCreateIdol.notify("--微笑着面对它，加油，奥力给！");
    }
}
