package UI.Swing1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 40417 on 2016/9/29 0029.
 */
public class JScrollPaneTest extends JFrame{
    public JScrollPaneTest(){
        Container c = getContentPane();
        JTextArea ta = new JTextArea(20,50);
        JScrollPane sp = new JScrollPane(ta);
        c.add(sp);
        setTitle("带滚动条的文字编译器");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }

}
