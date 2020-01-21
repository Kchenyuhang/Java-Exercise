package com.soft.week2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用反射机制调用类的方法
 * @Author yhChen
 * @Date 2020/1/21
 */
public class MaxTest {
    public static void main(String[] args) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("com.soft.week2.Max");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            assert clazz != null;
            //取得getMax方法
            Method getMaxMethod = clazz.getMethod("getMax",int.class,int.class);
            //取得print方法
            Method printMethod = clazz.getMethod("print");
            try {
                //利用反射机制调用以上方法
                //参数传递:3->a,5->b
                getMaxMethod.invoke(clazz.getDeclaredConstructor().newInstance(),3,5);
                printMethod.invoke(clazz.getDeclaredConstructor().newInstance());
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
