package com.soft.week4;

/**
 * @Author yhChen
 * @Description CheckBook接口实现
 * @Date 2020/2/18
 */
public class CheckBookDAOImpl implements CheckBookDAO {
    @Override
    public void check(Book book) {
        String word1 = "暴力", word2 = "血腥";
        try {
            if (book.getPrice() > 100) {
                throw new TooPriceException("《" + book.getName() + "》" + "价格大于100");
            }
            if (book.getName().contains(word1) || book.getName().contains(word2)) {
                throw new TooNameException("《" + book.getName() + "》" + "书名中含有“暴力”、“血腥”等禁词");
            }
            if (book.getIsbn().length() != 13) {
                throw new TooIsbnException("《" + book.getName() + "》" + "ISBN不是13位数字组成");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
