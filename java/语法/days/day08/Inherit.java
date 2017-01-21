package day08;

class Fu{
    String name;

    public Fu(String name){
        this.name = name;
        System.out.println("父类带参");
    }
    public Fu(){
        System.out.println("父类无参");
    }
    public void eat(){
        System.out.println("吃父类");
    }
}
class Zi extends Fu{
    int x = 20;
    public Zi(String name){
        super(name);
        System.out.println("子类带参");
    }
    public Zi(){
        System.out.println("x1="+x);
    }
    public void eat(int a){
        System.out.println(a+"吃子类");
    }

}
public class Inherit {
    public static void main(String[] args) {
        Zi z = new Zi("大头儿子");
        //System.out.println("name=" +z.name);
        z.eat(2);
        //Zi z2 = new Zi();
        //System.out.println(z2.name);

    }

}
