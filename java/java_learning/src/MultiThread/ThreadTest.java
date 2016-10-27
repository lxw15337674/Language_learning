public class ThreadTest extends Thread{
    private int count =100;
    public void run(){
        while (true){
            System.out.println(count);
            if(--count == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start();
        new ThreadTest().start();
    }
}
