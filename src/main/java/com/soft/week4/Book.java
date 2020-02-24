package com.soft.week4;

/**
 * @Author yhChen
 * @Description 图书类
 * @Date 2020/2/18
 */
public class Book {
    private String isbn;
    private String name;
    private Double price;

    public Book() {
        super();
    }

    public Book(String isbn, String name, Double price) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}