package com.soft.week4;

/**
 * @Author yhChen
 * @Description 自定义图书上传异常
 * @Date 2020/2/18
 */
public class TooPriceException extends Exception {
    public TooPriceException(String message) {
        super(message);
    }
}
