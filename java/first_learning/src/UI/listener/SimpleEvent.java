package UI.listener;
//内部类实现实现事件监听

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SimpleEvent extends JFrame {
    private JButton jb = new JButton("我是按钮");
    public SimpleEvent() {
        setLayout(null);
        setSize(200, 100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.add(jb);
        jb.setBounds(10, 10, 100, 30);
        jb.addActionListener(new jbAction());
        setVisible(true);
    }

    class jbAction implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            jb.setText("我被单击了");
        }
    }

    public static void main(String[] args) {
        new SimpleEvent();
    }
}
