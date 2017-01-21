package day07;

/**
 * Created by 40417 on 2016/11/19 0019.
 */
class Student1{
    String name ;
    int id;
    public Student1(int id,String name){
        this(name);
        this.id = id ;
        System.out.println("两个参数的构造方法"+id+name);
    }
    public Student1(String name){
        this.name = name;
        System.out.println("一个参数的构造方法"+id+name);
    }
}

public class _this {
    public static void main(String[] args) {

        Student1 s = new Student1(110,"lxw");
        System.out.println(s.name+s.id);
    }
}
