package day14;

/**
 * Created by 40417 on 2016/12/5 0005.
 */
class Mom extends Thread{
    @Override
    public void run() {
        System.out.println("妈妈洗菜");
        System.out.println("妈妈发现没有酱油了");
        Son s = new Son();
        s.start();
        try {
            s.join();//
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("妈妈继续炒菜");
        System.out.println("吃饭了");
    }
}

class Son extends Thread{
    @Override
    public void run() {
        System.out.println("儿子下楼");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("儿子买酱油了");
        System.out.println("儿子上楼,给妈妈");
    }
}
public class _join {
    public static void main(String[] args) {
         Mom m = new Mom();
         m.start();

    }
}
