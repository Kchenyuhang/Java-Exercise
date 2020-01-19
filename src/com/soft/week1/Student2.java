package com.soft.week1;

/**
 * @Author yhChen
 * @Date 2020/1/19
 */
public class Student2 {
    public static void main(String[] args) {
        Student0 student1 = new Student0();
        Student0 student2 = (Student0)student1.clone();
        boolean flag = (student1==student2);
        System.out.println("student1和student2是同一个对象吗？"+flag);
    }
}

class Student0 implements Cloneable{
    public int number;
    public void setInt(int number){
        this.number = number;
    }

    public int getInt(){
        return number;
    }
    @Override
    public Object clone(){
        Student0 student0 = null;
        try {
            student0 = (Student0)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student0;
    }
}