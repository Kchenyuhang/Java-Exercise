package com.soft.week2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author yhChen
 * @Description JAVA反射获取类名，方法名，属性及构造方法
 * @Date 2020/1/21
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("com.soft.week2.User");
        System.out.println("----------获取类名----------");
        System.out.println(clazz.toString());
        System.out.println(clazz.getSimpleName());
        System.out.println("----------获取类中声明的构造方法--------");
        Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println("方法名:" + con.getName());
            //方法修饰符
            System.out.println(",修饰符类型：" + con.getModifiers());
        }
        System.out.println("----------获取所有构造方法--------");
        Constructor[] cons1 = clazz.getConstructors();
        for (Constructor constructor : cons1) {
            System.out.println("方法名：" + constructor.getName() + "--");
            System.out.println(",修饰符类型：" + constructor.getModifiers());
        }
        System.out.println("---------获取类中定义的方法----------");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method value : methods) {
            System.out.println("方法名：" + value.getName());
            System.out.println(",修饰符类型：" + value.getModifiers());
        }
        System.out.println("---------获取该类的所有方法--------");
        Method[] methods1 = clazz.getMethods();
        for (Method method : methods1) {
            System.out.println("方法名：" + method.getName());
            System.out.println(",修饰符类型：" + method.getModifiers());
        }
        System.out.println("-----------获取所有的属性----------");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("属性名：" + field.getName());
            System.out.println(",修饰符类型：" + field.getModifiers());
        }
    }
}
