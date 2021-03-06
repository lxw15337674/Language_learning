package day13;

class SaleTicket extends Thread{
    static int num = 50;//票数,非静态的成员变量,非静态的成员变量数据是在每个对象中都会维护一份数据的.
//    static Object o = new Object();
    public SaleTicket(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true){
//            synchronized (o) {
            synchronized ("锁") {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "售出第" + num + "号票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num--;
                } else {
                    System.out.println("卖完了");
                    break;
                }
            }
        }
    }
}
public class thread_safe extends Thread{
    public static void main(String[] args) {
        SaleTicket thread1 = new SaleTicket("窗口1");
        SaleTicket thread2 = new SaleTicket("窗口2");
        SaleTicket thread3 = new SaleTicket("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
