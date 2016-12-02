package day13;

public class thread_method extends Thread{
    public thread_method(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("线程"+this.getName());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        thread_method tm = new thread_method("李希望");
        tm.start();
        for(int i=0;i<100;i++){
            System.out.println("主线程"+i);
        }
    }
}

