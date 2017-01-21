package day13;

/**
 * Created by 40417 on 2016/12/3 0003.
 */
class SaleTicket2 extends Thread{


    static int num = 50;//票数  非静态的成员变量,非静态的成员变量数据是在每个对象中都会维护一份数据的。

    static	Object o = new Object();

    public SaleTicket2(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized ("锁") {
                if(num>0){
                    System.out.println(Thread.currentThread().getName()+"售出了第"+num+"号票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                }else{
                    System.out.println("售罄了..");
                    break;
                }
            }

        }
    }


}


public class Demo4 {

    public static void main(String[] args) {
        //创建三个线程对象，模拟三个窗口
        SaleTicket2 thread1 = new SaleTicket2("窗口1");
        SaleTicket2 thread2 = new SaleTicket2("窗口2");
        SaleTicket2 thread3 = new SaleTicket2("窗口3");
        //开启线程售票
        thread1.start();
        thread2.start();
        thread3.start();

    }

}