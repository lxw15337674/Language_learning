package day09;

abstract class Animal{
    String name;
    String color;
    public Animal(String name,String color){
        this.name = name;
        this.color = color;
    }
    public abstract void run();
}
class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }
    public void run(){
        System.out.println(name+"四条腿跑的很快");
    }

}

class Fish extends Animal{
    public Fish(String name, String color) {
        super(name, color);
    }
    public void run(){
        System.out.println(name+"游动");
    }
}

public class abstract_class {
    public static void main(String[] args) {
        Dog d = new Dog("牧羊犬","棕色");
        d.run();
        Fish f = new Fish("锦鲤","金黄色");
        f.run();
    }
}
