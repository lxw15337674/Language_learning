package day08;

class Student{
    String name ;
    static String country = "中国";
    static{
        System.out.println("静态代码块执行");
    }

    public Student(String name){
        this.name = name;
    }
    public static void sleep(){
        System.out.println("睡觉");
    }
}

public class static_fuction {
    public static void main(String[] args) {
        System.out.println(Student.country);
        Student s1 = new Student("李希望");
        Student s2 = new Student("lxw");
        System.out.println(s1.name+s1.country);
        System.out.println(s2.name+s2.country);
        s1.country = "小日本";
        System.out.println(s1.name+s1.country);
        System.out.println(s2.name+s2.country);
        Student.sleep();
    }
}
