package day07.SAX;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * Created by 40417 on 2017/2/4 0004.
 */
public class first {
    public static void main(String[] args) throws Exception {
        //1.创建SAXParser对象
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        //2.调用parse方法(参数1:xml文档.参数2:DefaultHandler的子类)
        parser.parse(new File("src/day07/SAX/lol.xml"), new MyDefaultHandler());

    }
}
