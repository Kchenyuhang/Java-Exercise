package com.soft.week1;

/**
 * @Author yhChen
 * @Date 2020/1/19
 */
public class Student1 {
    private String name;
    private String sex;

    public Student1() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student1 student = new Student1();
        student.setName("张三");
        student.setSex("男");
        System.out.println(student);
    }
}


