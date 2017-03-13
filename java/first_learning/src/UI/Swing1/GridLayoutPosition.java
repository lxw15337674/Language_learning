package UI.Swing1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 40417 on 2016/9/29 0029.
 */
public class GridLayoutPosition extends JFrame{
    public GridLayoutPosition(){
        Container c =getContentPane();
        setLayout(new GridLayout(7,3,5,5));
        for (int i=0;i<20;i++){
            c.add(new JButton("button"+i));
        }
        setSize(300,300);
        setTitle("网格布局");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GridLayoutPosition();
    }
}
