package day14;

class Sale implements Runnable{
    static int num = 50;
    @Override
    public void run() {
        while (true) {
            synchronized ("锁") {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖了第" + num + "张票");
                    num--;
                } else {
                    System.out.println("卖完了");
                    break;
                }
            }
        }
    }
}
public class test2 {
    public static void main(String[] args) {
        Sale sale = new Sale();
        Thread t1 = new Thread(sale,"第一窗口");
        Thread t2 = new Thread(sale,"第二窗口");
        t1.start();
        t2.start();
    }
}
