package day09;

/**
 * Created by 40417 on 2016/11/20 0020.
 */
abstract class Animal1{
    String name;
    String color = "动物色";
    public Animal1(String name){
        this.name = name;
    }
    public abstract void run();

}
class Mouse1 extends Animal1{
    String color = "黑色";
    public Mouse1(String name){
        super(name);
        }
    public void run(){
        System.out.println(name+"四条腿走");
        }
}
class Fish1 extends Animal1{
    public Fish1(String name) {
        super(name);
    }
    public void run() {
        System.out.println(name+"摇尾巴");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
//        Mouse1 m = new Mouse1("老鼠");
//        m.run();

        Animal1 a = new Mouse1("老鼠");
        a.run();
        System.out.println(a.color);
    }
}
