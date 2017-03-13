package MultiThread;

public class ThreadSafeTest2 implements Runnable{
    int num = 10;
    public void run(){
        while(true){
            synchronized ("1"){
                if(num>0){
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println("tickets"+ --num);
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest2 t = new ThreadSafeTest2();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
