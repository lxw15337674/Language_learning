package day14;




import java.util.*;

/**
 * Created by 40417 on 2016/12/6 0006.
 */
public class _Collection{
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Person(110,"狗娃"));
        c.add(new Person(120,"爸比"));
        System.out.println(c);

        //        c.add("abc");
//        c.add(1);
//        c.add(3.14);
//
//        Collection c2 = new ArrayList();
//        c2.add("王林");
//        c2.add("123");
//        c.addAll(c2);
//        c.remove("123");
//        System.out.println(c);
//        System.out.println(c.size());
        System.out.println("存在该元素吗?"+c.contains(new Person(120,"爸比")));
    }

    private static class Person {
        int id;
        String name;
        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        //用于输出
        @Override
        public String toString() {
            return "{"+this.id + "," + this.name+"}";
        }
        //用于比较
        @Override
        public boolean equals(Object obj) {
            Person p = (Person) obj;
            return this.id == p.id;
        }
        //java规范,一般重写了equals方法,都会重写hashcode方法.
        @Override
        public int hashCode() {
            return this.id;
        }
    }
}
