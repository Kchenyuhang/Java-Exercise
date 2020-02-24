package com.soft.week4;

/**
 * @Author yhChen
 * @Description 检查图书
 * @Date 2020/2/18
 */
public interface CheckBookDAO {
    /**
     * 检查价格
     *
     * @param book book
     * @throws TooPriceException
     */
    void check(Book book) throws TooPriceException;
}
