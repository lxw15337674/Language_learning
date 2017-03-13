package UI.Swing1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 40417 on 2016/9/29 0029.
 */
public class AbsolutePosition extends JFrame{
    public AbsolutePosition(){
        setTitle("绝对布局");
        setLayout(null);
        setBounds(0,0,200,150);
        Container c = getContentPane();
        JButton b1 = new JButton("按钮1");
        JButton b2 = new JButton("按钮2");
        b1.setBounds(10,30,80,30);
        b2.setBounds(60,70,100,200);
        c.add(b1);
        c.add(b2);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }




}
