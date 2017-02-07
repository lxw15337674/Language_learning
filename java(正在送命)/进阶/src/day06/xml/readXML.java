package day06.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * Created by 40417 on 2017/2/2 0002.
 */
public class readXML {
    @Test
    public void test() throws DocumentException {
        StringBuffer sb = new StringBuffer();
        //读取xml文档
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new File("src/day06/xml/lol.xml"));

        //读取跟标签
        Element rootElement = doc.getRootElement();

        getChildElement(rootElement, sb);

        System.out.println(sb.toString());

    }

    //获取当前标签的子标签
    private void getChildElement(Element elem, StringBuffer sb) {
        //开始标签
        sb.append("<" + elem.getName());
        //得到标签的属性列表
        List<Attribute> attrs = elem.attributes();
        for (Attribute attr : attrs) {
            sb.append(" " + attr.getName() + "=\"" + attr.getValue() + "\"");
        }
        sb.append(">");


        //读取文本
        sb.append( elem.getText());

        List<Element> list = elem.elements();
        for (Element ele : list) {

            getChildElement(ele, sb);
        }
        //结束标签
        sb.append("</" + elem.getName() + ">\n");

    }
}
