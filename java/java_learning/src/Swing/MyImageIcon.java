package Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by 40417 on 2016/9/29 0029.
 */
public class MyImageIcon extends JFrame {
    public MyImageIcon(){
        Container container = getContentPane();
        JLabel jl = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
        URL url = MyImageIcon.class.getResource("imageButton.jpg");
        System.out.println(url);
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setOpaque(true);
        container.add(jl);
        setSize(250,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyImageIcon();
    }
}