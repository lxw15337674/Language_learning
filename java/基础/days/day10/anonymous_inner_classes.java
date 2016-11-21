package day10;

/**
 * Created by 40417 on 2016/11/21 0021.
 */
abstract class Animal{
    public abstract Animal run();
    public abstract void bite();
}
class Outer1{
    public void print(){
        //需求:在方法内部定义一个类继承Animal类,然后调用run方法
//        ///局部内部类
//        class Dog extends Animal{
//            @Override
//            public void run() {
//                System.out.println("狗在跑...");
//            }
//        }
//        Dog d = new Dog();
//        d.run();
        ///匿名内部类
        //创建Anial子类的对象.
        ///方式一
//       new Animal(){
//            //匿名内部类的成员
//            @Override
//            public Animal run() {
//                System.out.println("狗在跑...");
//                //用于后面bite方法的执行,所以返回类本身
//                return this;
//            }
//            public void bite(){
//                System.out.println("狗在咬人!");
//            }
//        }.run().bite();

        //方式二
        Animal a =new Animal(){//多态
            //匿名内部类的成员
            @Override
            public Animal run() {
                System.out.println("狗在跑...");
                //用于后面bite方法的执行,所以返回类本身
                return this;
            }
            public void bite(){
                System.out.println("狗在咬人!");
            }
//            如果有特有方法,就只能用局部内部类.
//            public void sleep(){
//                System.out.println("狗在睡觉");
//            }
        };
        a.run();
        a.bite();
    }
}
public class anonymous_inner_classes {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.print();
    }
}
