package Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 40417 on 2016/9/29 0029.
 */
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("流布局管理器");
        Container c =getContentPane();
        setLayout(new FlowLayout(60,10,10));
        for(int i=0;i<10;i++){
            c.add(new JButton("button"+i));
        }
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
