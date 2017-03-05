package day16;

import java.util.HashSet;
import java.util.Set;

class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ 编号:" + this.id + " 姓名:" + this.name + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode调用了");
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals调用了");
        Person p = (Person)obj;
        return this.id == p.id;
    }
}

public class Set_Example {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Person(110,"狗娃"));
        set.add(new Person(110,"狗娃"));
        set.add(new Person(110,"李希望"));
        set.add(new Person(120,"杀"));
        set.add(new Person(20,"阿斯顿"));
        set.add(new Person(444,"地方"));

        System.out.println("集合的元素"+set);


    }


}
