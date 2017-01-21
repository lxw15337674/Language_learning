package day14;

/**
 * Created by 40417 on 2016/12/5 0005.
 */
public class _Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("this:"+this);
        System.out.println("当前线程"+ Thread.currentThread());
    }

    public static void main(String[] args) {
        //创建Runnable实现类的对象
        _Thread thread = new _Thread();
        //创建Thread类的对象,把runnable实现类对象作为实参传递.
        Thread t1 = new Thread(thread,"爸比");
        Thread t2 = new Thread(thread,"儿子");
        //调用thread对象的start方法开启线程.
        t1.start();
        t2.start();

    }
}
