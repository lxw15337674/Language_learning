package day07.Xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import java.util.List;

/**
 * Created by 40417 on 2017/2/3 0003.
 */
public class test {
    @Test
    public void test() throws DocumentException {
        Document doc = new SAXReader().read("src/day07/Xpath/lol.xml");
        String xpath = "";

        //绝对路径
        xpath = "/Students";
        xpath = "/Students/Student";

        //相对路径
        xpath = "//contact/name";
        xpath = "//name";

        //通配符
        xpath = "/Students/*";
        xpath = "/Students//*";


        xpath = "//Student[@id]";//带有id属性的student标签
        xpath = "//Student[2]";//第二个的student标签
        xpath = "//Student[last()]";//选取最后一个student标签

        //@ 属性
        xpath = "//@id";//表示选择属性节点
        xpath = "//Student[not(@id)]";//选择不包含id属性的Student节点
        xpath = "//Student[@id='001'and@name='eric']";//选择id属性值为001，且name属性为eric的contact标签

        //text() 表示选择文本内容,返回text对象
        xpath = "//name/text()";
        xpath = "//Student/name[text()='张三']";



        List<Node> list = doc.selectNodes(xpath);
        for (Node node : list) {
            System.out.println(node);
        }
    }
}
