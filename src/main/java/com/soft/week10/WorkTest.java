package com.soft.week10;

import com.soft.week2.Max;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/2/24
 */
public class WorkTest {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Avenger","江苏",1500));
        workers.add(new Worker("Berserker","安徽",2000));
        workers.add(new Worker("Mary","江苏",2500));
        workers.add(new Worker("Allen","重庆",2000));
        workers.add(new Worker("Olivia","四川",1000));
        workers.add(new Worker("Archer","安徽",2500));
        workers.add(new Worker("Saber","江苏",2500));
        workers.add(new Worker("Caster","山东",3500));
        workers.add(new Worker("Rider","浙江",1500));
        workers.add(new Worker("Assassin","四川",2000));
        workers.add(new Worker("Lancer","江苏",2500));

        System.out.println("员工总人数：");
        Optional<Integer> reduce = workers.stream().map((e)->1).reduce(Integer::sum);
        System.out.println(reduce);
        System.out.println("***********************************");
        System.out.println("按照姓名首字母排序：");
        workers.sort(Comparator.comparing(Worker::getName));
        workers.forEach(System.out::println);
        System.out.println("***********************************");
        System.out.println("判断是否有“江苏”籍贯的员工：");
        boolean anyMatch =  workers.stream().anyMatch(s -> s.getAddress().equals("江苏"));
        System.out.println(anyMatch);
        System.out.println("***********************************");
        System.out.println("计算所有江苏员工的月总收入：");
        Optional<Integer> salary = workers.stream().filter(s -> s.getAddress().equals("江苏"))
                .map(s -> s.getMonthSalary()).reduce(Integer::sum);
        System.out.println(salary.get());
    }
}
