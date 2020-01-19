package com.soft.week1;

import java.io.*;
import java.util.Objects;

/**
 * @Author yhChen
 * @Date 2020/1/19
 */
public class CreateStudent implements Cloneable, Serializable {
    private String name;
    private String code;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return (CreateStudent)super.clone();
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CreateStudent cs = (CreateStudent) o;
        if (!Objects.equals(code, cs.code)) {
            return false;
        }
        return Objects.equals(name, cs.name);
    }

    @Override
    public int hashCode(){
        int result = code !=null ?code.hashCode() : 0;
        result = 31 * result +(name != null ? name.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CreateStudent{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception{
        //1、使用呢哇关键值创建对象
        CreateStudent cs1 = new CreateStudent();
        cs1.setCode("111");
        cs1.setName("学生1");
        System.out.println(cs1);

        //2、使用clone创建对象
        CreateStudent cs2 = new CreateStudent();
        Object clone = cs2.clone();
        System.out.println(cs2);

        //3、使用反射创建对象
        Class c = Class.forName("com.soft.week1.CreateStudent");
        Object o = c.newInstance();
        System.out.println(o);

        //4、使用反序列化创建对象
        //先序列化
        CreateStudent cs3 = new CreateStudent();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.obj"));
        oos.writeObject(cs3);
        //再反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.obj"));
        Object o1 = ois.readObject();
        System.out.println(o1);

    }
}
