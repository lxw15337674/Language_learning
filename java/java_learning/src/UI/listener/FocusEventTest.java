package UI.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by 40417 on 2016/10/6 0006.
 */
public class FocusEventTest extends JFrame {
    public FocusEventTest(){
        setSize(250,100);
        Container cp=getContentPane();
        getContentPane().setLayout(new FlowLayout());

        final JLabel label = new JLabel();
        getContentPane().add(label);
        JTextField jt = new JTextField("请单击其他文本框",10);
        JTextField jt2 = new JTextField("请单击我",10);
        cp.add(jt);
        cp.add(jt2);
        jt.addFocusListener(new FocusListener() {
            public void focusLost(FocusEvent arg0){
                JOptionPane.showMessageDialog(null,"文本框失去焦点");
            }
            @Override
            public void focusGained(FocusEvent arg0) {
            }
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new FocusEventTest();
    }
}
