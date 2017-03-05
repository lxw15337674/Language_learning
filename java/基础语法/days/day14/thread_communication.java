package day14;

class Product{
    String name;

    double price;

    boolean flag = false;//标志,默认没有生产完成的

}
class Producer extends Thread{

    Product p;

    public Producer(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        int i = 0;

        while(true){
            synchronized (p) {
                if (p.flag == false) {
                    if (i % 2 == 0) {
                        p.name = "苹果";
                        p.price = 6.5;
                    } else {
                        p.name = "香蕉";
                        p.price = 2.0;
                    }
                    System.out.println("生产者生产了: " + p.name + ",价格:" + p.price);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.flag = true;
                    i++;
                    p.notify();//唤醒消费者去消费.
                }else{
                    //已经生产完毕,等待消费者去消费
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
//消费者
class Customer extends Thread{

    Product p;

    public Customer(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            synchronized (p){
                if(p.flag == true) {//产品已经生产完毕
                    System.out.println("消费者消费了" + p.name + ",价格:" + p.price);
                    p.flag = false;
                    p.notify();//唤醒生产者去生产
                }else{
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
    }
}

public class thread_communication {
    public static void main(String[] args) {
        Product p = new Product();
        Producer producer = new Producer(p);
        Customer customer = new Customer(p);
        producer.start();
        customer.start();


    }
}
