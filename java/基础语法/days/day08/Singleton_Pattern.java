package day08;


//饿汉单例设计模式--保证single在内存中只有一个对象
class Single{
    //声明本类的引用类型变量,并且使用该变量指向本类对象
    private static Single s= new Single();
    //私有化构造函数
    private Single(){
        System.out.println('1');
    }
    //提供一个公共静态的方法获取本类的对象
    public static Single getInstance(){
        System.out.println('2');
        return s;
    }
}

//懒汉单例设计模式
class Single2{
    private static Single2 s;
    private Single2(){
    }
    public static Single2 getInstance(){
        if(s==null){
            s = new Single2();
        }
        return s;
    }
}

public class Singleton_Pattern {
    public static void main(String[] args){
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1==s2);
    }
}
