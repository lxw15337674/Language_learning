//需求:使用java类描述一个学生类
class Student{
    int num;
    String name;
    public void study(){
        System.out.println("好好学习");
    }
}
public class Anonymous_object {
    public static void main(String[] args) {
//        new Student().name = "李希望";
//        System.out.println(Student().name);
//        System.out.println(new Student() == new Student());//"=="用于引用类型变量时,比较的是内存地址
        new Student().study();
    }

}
