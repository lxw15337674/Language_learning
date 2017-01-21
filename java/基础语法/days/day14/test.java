package day14;

/**
 * Created by 40417 on 2016/12/5 0005.
 */
/*一个银行账户5000块,两夫妻一个拿着存折,一个拿着卡,开启取钱比赛,每次只能取一千块
    要求不出现线程安全问题
    */
class take_money extends Thread{
    static int Money = 5000;
    public take_money(String name){
        super(name);
    }
    @Override
    public void run() {
        while(true){
            synchronized ("锁"){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(Money<=0){
                    System.out.println("没钱了");
                    break;
                }
                else{
                    Money-=1000;
                    System.out.println(Thread.currentThread().getName()+"取了1000,还剩"+Money);
                }
            }
        }
    }
}
public class test {
    public static void main(String[] args) {
        take_money take1 = new take_money("爸爸");
        take_money take2 = new take_money("妈妈");
        take1.start();
        take2.start();
    }

}
