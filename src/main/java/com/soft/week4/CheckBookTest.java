package com.soft.week4;

/**
 * @Author yhChen
 * @Description 测试程序
 * @Date 2020/2/18
 */
public class CheckBookTest {
    public static void main(String[] args) {
        Book[] books = {
                new Book("0000000000001", "权力的游戏", 110.0),
                new Book("0000000000009", "钢铁是怎样炼成的", 90.0),
                new Book("0000000000002", "暴力美学", 85.0)
        };
        CheckBookDAO cb = new CheckBookDAOImpl();
        try {
            for (Book book : books) {
                cb.check(book);
            }
        } catch (TooPriceException e) {
            System.err.println(e.toString());
        }
    }
}
