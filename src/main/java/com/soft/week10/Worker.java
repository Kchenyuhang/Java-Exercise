package com.soft.week10;

/**
 * @Author yhChen
 * @Description Steam API 练习
 * @Date 2020/2/24
 */
public class Worker {
    private String name;
    private String address;
    private Integer monthSalary;

    public Worker() {
        super();
    }

    public Worker(String name, String address, Integer monthSalary) {
        this.name = name;
        this.address = address;
        this.monthSalary = monthSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(Integer monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public String toString() {
        return "姓名：" + name +
                ", 籍贯：" + address +
                ", 月薪" + monthSalary;
    }
}
