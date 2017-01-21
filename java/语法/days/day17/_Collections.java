package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person2 {
    String name;
    int age;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{姓名"+this.name+" 年龄:"+this.age+"}";
    }
}

class Agecomparator implements Comparator<Person2>{

    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.age-o2.age;
    }
}
public class _Collections {
    public static void main(String[] args) {
        ArrayList<Person2> list = new ArrayList();
        list.add(new Person2("李希望",12));
        list.add(new Person2("张三",1));
        list.add(new Person2("李四",23));
        list.add(new Person2("王二",4));
        System.out.println(list);
        Collections.sort(list,new Agecomparator());
        System.out.println(list);
    }
}
