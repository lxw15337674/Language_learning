package UI.Swing1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 40417 on 2016/10/6 0006.
 */
public class JComboBoxModelTest extends JFrame {
    JComboBox<String> jc = new JComboBox<>(new MyComboBox());
    JLabel jl = new JLabel("请选择证件:");
    public JComboBoxModelTest(){
        setSize(new Dimension(160, 180));
        setVisible(true);
        setTitle("在窗口中设置下拉列表框");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(jl);
        cp.add(jc);
    }

    public static void main(String[] args) {
        new JComboBoxModelTest();
    }
}
class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{
    String selecteditem = null;
    String[] test ={"身份证","军人证","学生证"};
    public String getElementAt(int index) {
        return test[index];
    }
    public int getSize(){
        return test.length;
    }

    @Override
    public void setSelectedItem(Object item) {
        selecteditem = (String)item;
    }

    @Override
    public Object getSelectedItem() {
        return selecteditem;
    }
    public int getIndex() {
        for (int i = 0; i < test.length; i++) {
            if (test[i].equals(getSelectedItem()))
                return i;
        }
        return 0;
    }
}
