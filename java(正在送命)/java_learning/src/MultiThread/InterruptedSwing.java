package MultiThread;

import javax.swing.*;
import java.awt.*;

public class InterruptedSwing extends JFrame{
    Thread thread;
    public static void main(String[] args) {
        init(new InterruptedSwing(),100,100);
    }
    public InterruptedSwing(){
        super();
        final JProgressBar progressBar = new JProgressBar();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        progressBar.setStringPainted(true);
        thread = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true){
                    progressBar.setValue(++count);
                    try{
                        thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println("中断");
                        break;
                    }
                }

            }
        });
        thread.start();//启动线程
        thread.interrupt();//中断线程
    }
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
