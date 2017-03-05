package MultiThread;

public class InterruptedTest implements Runnable{
    private boolean isContinue = false;

    public void run(){
        int a=0;
        while(true){
            a++;
            if(isContinue){
                break;
            }
        }
    }
    public void setContinue(){
        this.isContinue = true;
    }
}
