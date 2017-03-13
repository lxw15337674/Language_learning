package UI.Swing1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by 40417 on 2016/10/6 0006.
 */
public class JButtonTest extends JFrame {
    public JButtonTest(){
        URL url = JButtonTest.class.getResource("imageButton.jpg");
        Icon icon = new ImageIcon(url);
        setLayout(new GridLayout(3, 2, 5, 5));
        Container c = getContentPane();
        for (int i=0;i<5;i++){
            JButton J =new JButton("button"+i,icon);
            c.add(J);
            if (i%2==0){
                J.setEnabled(false);
            }
        }
        JButton jb = new JButton();
        jb.setMaximumSize(new Dimension(90,30));
        jb.setIcon(icon);
        jb.setHideActionText(true);
        jb.setToolTipText("图片按钮");
        jb.setBorderPainted(false);
        jb.setBorderPainted(false);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"弹出对话框");
            }
        });
        c.add(jb);
        setTitle("创建带文字与图片的按钮");
        setSize(350,150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
