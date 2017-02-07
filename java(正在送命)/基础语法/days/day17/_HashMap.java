package day17;

import java.util.HashMap;

/**
 * Created by 40417 on 2016/12/29 0029.
 */
    class Person{
        int id;
        String name;
        public Person(int id,String name){
            this.id = id ;
            this.name = name;
        }

    @Override
    public String toString() {
        return " 编号:"+this.id+" 姓名:"+this.name;
    }

}
public class _HashMap {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person(110,"李希望"),"001");
        map.put(new Person(220,"广发"),"004");
        map.put(new Person(450,"请问"),"002");
        map.put(new Person(10,"阿斯顿"),"005");
        map.put(new Person(110,"李希望"),"001");
        System.out.println(map);

    }
}
