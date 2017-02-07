package UI.Swing1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 40417 on 2016/9/29 0029.
 */
public class BorderLayoutPosition extends JFrame {
    String[] border = {BorderLayout.CENTER,BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
    String[] buttonName = {"center button","north button","south button","west button","east button"};
    public BorderLayoutPosition(){
        setTitle("边界布局");
        Container c = getContentPane();
        setLayout(new BorderLayout());
        for(int i=0;i<border.length;i++){
            c.add(border[i],new JButton(buttonName[i]));
        }
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
