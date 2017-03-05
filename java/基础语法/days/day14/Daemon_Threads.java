package day14;

/**
 * Created by 40417 on 2016/12/5 0005.
 */
public class Daemon_Threads extends Thread{
    public Daemon_Threads(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<=100;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("已下载"+i+"%");
            if(i==100){
                System.out.println("更新包下载完毕");
            }
        }
    }

    public static void main(String[] args) {
        Daemon_Threads dt = new Daemon_Threads("后台线程");
        System.out.println("是守护线程吗?"+ dt.isDaemon());//判断是否为守护线程
        dt.setDaemon(true);
        dt.start();
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
