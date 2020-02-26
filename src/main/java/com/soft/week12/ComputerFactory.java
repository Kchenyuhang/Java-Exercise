package com.soft.week12;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/26
 */
public class ComputerFactory {
    public static Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "hp":
                computer = new HpComputer();
                break;
            case "asus":
                computer = new AsusComputer();
                break;
        }
        return computer;
    }
}
