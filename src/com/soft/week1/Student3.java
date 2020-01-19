package com.soft.week1;

import java.io.*;

/**
 * 通过反序列化创建一个对象
 *
 * @Author yhChen
 * @Date 2020/1/19
 */
public class Student3 implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student3() {
        this.name = "Lilia";
        this.age = 11;
    }

    public static void main(String[] args) {
        Student3 student3 = new Student3();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            FileOutputStream fos = new FileOutputStream("student.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(student3);
            oos.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        //反序列化
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ois = new ObjectInputStream(fis);
            Student3 student = (Student3)ois.readObject();
            System.out.println("student3和student是同一个对象吗？"+(student3==student));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
