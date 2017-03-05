package day07.DOM;
//写出内容到xml文档

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import java.io.*;

/**
 * Created by 40417 on 2017/2/3 0003.
 */
public class writeXML {
    public static void main(String[] args) throws Exception {
        //读取xml文件
        Document doc = new SAXReader().read(new File("src/day07/Dom/lol.xml"));

        //修改DOCument对象内容




        //指定输出位置
        FileOutputStream out = new FileOutputStream("D://test.xml");
        //1.创建写出对象
        XMLWriter writer = new XMLWriter(out);
        //2.写出
        writer.write(doc);
        //3.关闭流
        writer.close();
    }
}
