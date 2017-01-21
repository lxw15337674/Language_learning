package day13;
//模拟多线程进行
class Talk extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("聊天");
        }
    }
}
class Video extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("视频___");
        }
    }
}
public class tread_example {
    public static void main(String[] args) {
        Video v = new Video();
        v.start();
        Talk t = new Talk();
        t.start();
    }
}
