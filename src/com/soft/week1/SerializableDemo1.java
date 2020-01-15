package com.soft.week1;

import java.io.*;

/**
 * @Author yhChen
 * @Date 2020/01/2020/1/15
 */
public class SerializableDemo1 {
    public static void main(String[] args)
    {
        Student st = new Student("Tom",'M',20,3.6);
        File file = new File("D:/FileOutPut/student.txt");
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            //Student对象序列化过程
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.flush();
            oos.close();
            fos.close();

            //Student对象反序列化过程
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student st1 = (Student) ois.readObject();
            System.out.println("name = " + st1.getName());
            System.out.println("sex = " + st1.getSex());
            System.out.println("year = " + st1.getYear());
            System.out.println("gpa = " + st1.getGpa());
            ois.close();
            fis.close();
        }catch(ClassNotFoundException | IOException e){
            e.printStackTrace();
        }
    }
}
