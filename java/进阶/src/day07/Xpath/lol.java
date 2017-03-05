package day07.Xpath;


import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

/**
 * 第一个xpath程序
 * @author APPle
 *
 */
public class lol {


    @Test
    public void test1() throws Exception{
        Document doc = new SAXReader().read(new File("src/day07/Xpath/lol.xml"));

        //1.查询id为2的学生标签
        //使用xpath技术
        Element stuElem = (Element)doc.selectSingleNode("//Student[@id='2']");

        //2.删除标签
        stuElem.detach();

        //3.写出xml文件
        FileOutputStream out = new FileOutputStream("src/day07/Xpath/test.xml");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        XMLWriter writer = new XMLWriter(out,format);
        writer.write(doc);
        writer.close();

    }

}