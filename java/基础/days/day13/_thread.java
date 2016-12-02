package day13;

/**
 * Created by 40417 on 2016/12/2 0002.
 */
public class _thread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("线程"+i);
        }
    }

    public static void main(String[] args) {
        _thread t = new _thread();
        t.start();
        for(int i=0;i<100;i++){
            System.out.println("main线程"+i);
        }
    }
}
