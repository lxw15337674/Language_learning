package day10;

/**
 * Created by 40417 on 2016/11/21 0021.
 */
class Outer{
    int i = 100;//成员变量
    //成员内部类
    class Inner{
        int i =10;
        public void print(){
            System.out.println("这个是成员内部类的print方法!");
        }
    }
    public void test(){
        //局部变量
        final int y=100;
        //局部内部类
        class Inner{
            int x =10;
            public void print(){
                System.out.println("这个是局部内部类的print方法!");
            }
        }
        Inner inner = new Inner();
        inner.print();
    }
}
public class Internal_class {
    public static void main(String[] args) {
////        方式一
//        Outer outer = new Outer();
//        outer.test();
//        Outer.Inner inner = new Outer().new Inner();
//        inner.print();
        Outer outer = new Outer();
        outer.test();
    }
}
