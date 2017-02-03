package day07.DOM;
//写出内容到xml文档

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;

/**
 * Created by 40417 on 2017/2/3 0003.
 */
public class changeXML {
    public static void main(String[] args) throws IOException, DocumentException {
        Document doc = new SAXReader().read(new File("src/day07/DOM/lol.xml"));
        //指定输出位置
        FileOutputStream out = new FileOutputStream("D://test.xml");
        //指定写出的格式
        OutputFormat format = OutputFormat.createCompactFormat();//compact 紧凑的 Format 格式
//        OutputFormat format = OutputFormat.createPrettyPrint();//漂亮的格式
        //指定生成的xml文档编码
        format.setEncoding("utf-8");

        //1.创建写出对象
        XMLWriter writer = new XMLWriter(out);
        //2.写出
        writer.write(doc);
        //3.关闭流
        writer.close();
    }
}
