package com.soft.week1;

import java.io.*;
import java.util.UUID;

/**
 * 使用缓冲流，实现文本文件和非文本文件的拷贝
 *
 * @author yhChen
 * @date 2020.1.14
 */
public class FileCopy {
    public static void main(String[] args) {
        //非文本文件拷贝
        try {
            //指定源文件
            File startFile = new File("D:/FileOutPut/RandomStudy.txt");
            String startFileName = startFile.getName();
            int position = startFileName.indexOf(".");
            //取得文件扩展名
            String suffixName = startFileName.substring(position+1);
            //新的文件名
            String endName = UUID.randomUUID().toString();
            //指定文件复制到的路径
            File endFile = new File("D:/FileOutPut/"+endName+"."+suffixName);
            byte[] bytes = new byte[(int) startFile.length()];

            InputStream input = new FileInputStream(startFile);
            OutputStream out = new FileOutputStream(endFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(input);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);
            int temp = 0;
            while ((temp=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(temp);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
            System.out.println("文件复制成功");
        } catch (IOException e) {
            System.out.println("文件复制失败");
        }
    }
}
