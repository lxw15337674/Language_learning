package day07.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by 40417 on 2017/2/4 0004.
 */


//SAX处理程序(如何解析xml文档)
public class MyDefaultHandler extends DefaultHandler {

    //开始文档时调用
    @Override
    public void startDocument() throws SAXException {
        System.out.println("开始文档");
    }

    //结束文档时调用
    @Override
    public void endDocument() throws SAXException {
        System.out.println("结束文档");
    }

    //开始标签时调用
    @Override
    public void startElement(String s, String s1, String s2, Attributes attributes) throws SAXException {
        System.out.println("开始标签的标签名:"+s2);
    }

    //读到结束标签时调用
    @Override
    public void endElement(String s, String s1, String s2) throws SAXException {
        System.out.println("结束标签的标签名:"+s2);
    }

    //读到文本内容时调用
    @Override
    public void characters(char[] chars, int i, int i1) throws SAXException {
        System.out.println(new String(chars,i,i1));
    }
}
