package day16;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by 40417 on 2016/12/15 0015.
 */

class Emp implements Comparable<Emp> {
    int id;

    String name;

    int salary;

    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.salary;
    }

    @Override
    public int compareTo(Emp o) {
        //根据薪水排序
        return this.salary - o.salary;
    }
}

//自定义比较器
class MyComparator implements Comparator<Emp> {
    //根据第一个参数小于,等于或大于第二个参数分别返回负参数,零或正整数.
    @Override
    public int compare(Emp o1, Emp o2) {
        return  o1.id - o2.id;
}

public static class _TreeSet {
    public static void main(String[] args) {
//        TreeSet tree = new TreeSet();
////        tree.add(1);
////        tree.add(52);
////        tree.add(23);
////        tree.add(8);
//        tree.add('a');
//        tree.add('t');
//        tree.add('2');
//        System.out.println(tree);
        //创建一个比较器对象
        MyComparator com = new MyComparator();
        //创建TreeSet的时候传入比较器
        TreeSet tree = new TreeSet(com);
        tree.add(new Emp(110, "老沈", 300));
        tree.add(new Emp(220, "老王", 200));
        tree.add(new Emp(150, "老李", 100));
        tree.add(new Emp(330, "老人", 220));
        System.out.println(tree);

    }
}}
