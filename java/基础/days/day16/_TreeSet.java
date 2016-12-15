package day16;

import java.util.TreeSet;

/**
 * Created by 40417 on 2016/12/15 0015.
 */
class Emp implements Comparable{
    int id;

    String name;

    int salary;

    public Emp(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return this.id+" "+this.name+" "+this.salary;
    }

    @Override
    public int compareTo(Object o) {
        //根据薪水排序
        return this.salary-((Emp) o).salary;
    }
}

public class _TreeSet {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
////        tree.add(1);
////        tree.add(52);
////        tree.add(23);
////        tree.add(8);
//        tree.add('a');
//        tree.add('t');
//        tree.add('2');
//        System.out.println(tree);
        tree.add(new Emp(110,"老沈",300));
        tree.add(new Emp(220,"老王",200));
        tree.add(new Emp(150,"老李",100));
        tree.add(new Emp(330,"老人",220));
        System.out.println(tree);



    }
}
