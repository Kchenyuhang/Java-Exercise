package com.soft.week7;

/**
 * @Author yhChen
 * @Description 运动员A
 * @Date 2020/2/21
 */
public class AthleteA extends Athlete{
    private Student student;
    public AthleteA(Student student) {
        super();
        this.student = student;
    }

    @Override
    public void doSomething() {
        student.doSomething();
        playSport();
    }

    /**
     * 运动员A开始参加比赛
     */
    public void playSport(){
        System.out.println("运动员A参加了男子100米");
        System.out.println("运动员A男子100米进入决赛");
        System.out.println("运动员A获得男子100米冠军");
    }
}
