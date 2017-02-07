package day06.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.in;

/**
 * Created by 40417 on 2017/2/2 0002.
 */
public class test {
    @Test
    public void test1() throws DocumentException {
        //创建一个xml解析器对象
        SAXReader reader = new SAXReader();
        //读取xml文档,返回document对象
        Document doc = reader.read(new File("src/day06/xml/lol.xml"));

        //得到当前节点下的所有子节点对象(不包括孙节点以下的节点)
        Iterator<Node> ite = doc.nodeIterator();
        while (ite.hasNext()) {
            Node node = ite.next();
            String name = node.getName();
            System.out.println(name);

            //继续取出其下面的子节点
            //只有标签节点才有子节点
            //判断当前节点是否是标签节点
            if (node instanceof Element) {
                Element elem = (Element) node;
                Iterator<Node> ite2 = elem.nodeIterator();
                while (ite2.hasNext()) {
                    Node n2 = ite2.next();
                    System.out.println(n2.getName());
                }
            }
        }
    }

    @Test
    public void test2() throws DocumentException {
        //创建一个xml解析器对象
        SAXReader reader = new SAXReader();
        //读取xml文档,返回document对象
        Document doc = reader.read(new File("src/day06/xml/lol.xml"));

        //得到根标签
        Element rootElem = doc.getRootElement();

        getChildNode(rootElem);

    }

    //获取传入标签下的所有节点
    private void getChildNode(Element elem) {
        System.out.println(elem.getName());
        //得到子节点
        Iterator<Node> it = elem.nodeIterator();
        while (it.hasNext()) {
            Node node = it.next();

            //判断是否是标签节点
            if (node instanceof Element) {
                Element el = (Element) node;
                //递归
                getChildNode(el);
            }
        }
    }

    //    获取标签
    @Test
    public void test3() throws DocumentException {
        //创建一个xml解析器对象
        SAXReader reader = new SAXReader();
        //读取xml文档,返回document对象
        Document doc = reader.read(new File("src/day06/xml/lol.xml"));

        //1.得到根标签
        Element rootElem = doc.getRootElement();
        //2.得到标签名称
        String name = rootElem.getName();
//        System.out.println(name);

        //3.得到当前标签下制定名称的第一个子标签
        Element contactElem = rootElem.element("contact");
//        System.out.println(contactElem.getName());

        //4.得到所有子标签
        Iterator<Element> it = rootElem.elementIterator();
        while (it.hasNext()) {
            Element elem = it.next();
//            System.out.println(elem.getName());
        }

        //5.得到所有标签下的所有子标签
        List<Element> list = rootElem.elements();
        for(Element e : list){
            System.out.println(e.getName());
        }



    }
}
