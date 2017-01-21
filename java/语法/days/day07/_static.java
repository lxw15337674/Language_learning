package day07;

class Student2{
    String name ;
    static String country = "中国";
    public Student2(String name){
        this.name = name;

    }
}

public class _static {
    public static void main(String[] args) {
        System.out.println(Student2.country);
        Student2 s1 = new Student2("李希望");
        Student2 s2 = new Student2("lxw");
        System.out.println(s1.name+s1.country);
        System.out.println(s2.name+s2.country);
        s1.country = "小日本";
        System.out.println(s1.name+s1.country);
        System.out.println(s2.name+s2.country);
    }
}
