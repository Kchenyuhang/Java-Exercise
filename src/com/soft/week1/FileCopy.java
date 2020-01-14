package com.soft.week1;

import java.io.*;
import java.util.UUID;

/**
 * @author yhChen
 * @date 2020.1.14
 */
public class FileCopy {
    public static void main(String[] args) {
        try {
            //指定源文件
            File startFile = new File("D:/资源/pictures/P1.jpg");
            String startFileName = startFile.getName();
            int position = startFileName.indexOf(".");
            //获得文件扩展名
            String suffixName = startFileName.substring(position+1);
            //随机生成新的文件名
            String endName = UUID.randomUUID().toString();
            //指定文件复制到的路径
            File endFile = new File("D:/FileOutPut/"+endName+"."+suffixName);
            byte[] bytes = new byte[(int) startFile.length()];
            //字节输入流
            InputStream fileInputStream = new FileInputStream(startFile);
            int write = fileInputStream.read(bytes);
            fileInputStream.close();
            //字节输入流
            OutputStream b = new FileOutputStream(endFile);
            b.write(bytes);
            b.close();
            System.out.println("复制成功");
        } catch (IOException e) {
            System.out.println("复制失败");
        }
    }
}
