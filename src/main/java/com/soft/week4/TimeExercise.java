package com.soft.week4;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @Author yhChen
 * @Description 创建一个当前Instant对象，将其转换为LocalDateTime对象，
 * 减少一个月后，再转换为LocalDate对象，将其按照“1970年01月01日”格式打印。
 * @Date 2020/2/17
 */
public class TimeExercise {
    public static void main(String[] args) {
        //获取当前时间的Instant实例
        Instant instant = Instant.now();
        //调用LocalDateTime类中的ofInstant方法进行转换
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        //减少一小时
        LocalDateTime minusLocalDateTime = localDateTime.minusHours(1);
        //调用LocalDate类中的toLocalDate方法转换成LocalDate对象
        LocalDate localDate = minusLocalDateTime.toLocalDate();
        //创建解析模板
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        //被格式化对象调用format方法进行格式化
        System.out.println(localDate.format(formatter));
    }
}
