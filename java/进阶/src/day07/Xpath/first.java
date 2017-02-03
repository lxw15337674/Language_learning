package day07.Xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by 40417 on 2017/2/3 0003.
 */
public class first {
    //删除id为2的学生标签
    public static void main(String[] args) throws Exception {
        Document doc = new SAXReader().read("src/day07/Xpath/lol.xml");

        //查询id为2的学生标签
        //使用xpath技术
        Element elem = (Element)doc.selectSingleNode("//Student[@id='2']");

        //删除标签
        elem.detach();

        //写出xml文件
        FileOutputStream out = new FileOutputStream("src/day07/Xpath/test.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(out,format);
        writer.write(doc);
        writer.close();

    }
}
