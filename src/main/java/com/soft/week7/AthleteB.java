package com.soft.week7;

/**
 * @Author yhChen
 * @Description 运动员B
 * @Date 2020/2/21
 */
public class AthleteB extends Athlete {
    private Student student;

    public AthleteB(Student student) {
        super();
        this.student = student;
    }

    @Override
    public void doSomething() {
        student.doSomething();
        award();
    }

    /**
     * 比赛结束，计软院获得本次运动会“团体第一名”，
     * 运动员B作为运动员代表上台领奖
     */
    public void award() {
        System.out.println("运动员B作为运动员代表，上台领奖");
    }
}
