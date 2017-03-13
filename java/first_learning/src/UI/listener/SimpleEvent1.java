package UI.listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEvent1 extends JFrame implements ActionListener{
    private JButton jb = new JButton("我是按钮");
    public SimpleEvent1() {
        setLayout(null);
        setSize(200, 100);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.add(jb);
        jb.setBounds(10, 10, 100, 30);
        jb.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        jb.setText("我被点击了");
    }

    public static void main(String[] args) {
        new SimpleEvent1();
    }
}
