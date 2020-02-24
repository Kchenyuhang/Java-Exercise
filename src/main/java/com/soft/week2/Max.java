package com.soft.week2;

/**
 * @Author yhChen
 * @Date 2020/1/21
 */
public class Max {
    private static int max;

    public int getMax(int a, int b){
        max = Math.max(a,b);
        return max;
    }

    public void print() {
        System.out.println("最大值=" + max);
    }
}
