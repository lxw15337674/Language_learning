package day07.Xpath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Created by 40417 on 2017/2/4 0004.
 */
public class readXML {
    public static void main(String[] args) throws DocumentException {
        Document doc = new SAXReader().read("src/day07/Xpath/personList.html");

        //读取title标签
        Element titleElem = (Element) doc.selectSingleNode("//title");
        String title = titleElem.getText();
        System.out.println(title);

        /*
        练习:读取联系人的所有信息
        输出格式:
            编号:001 姓名:张三 性别:男 年龄:18 地址:xxxx 电话:xxxx
        */
        //1.读取所有的tbody中的tr标签
        List<Element> list = (List<Element>) doc.selectNodes("//tbody/tr");
        //2.遍历
        for (Element elem : list) {
            //编号
            String id = ((Element)elem.elements().get(0)).getText();
            //名字
            String name = ((Element)elem.elements().get(1)).getText();
            //性别
            String sex = ((Element)elem.elements().get(2)).getText();
            //年龄
            String age = ((Element)elem.elements().get(3)).getText();
            //地址
            String address = ((Element)elem.elements().get(4)).getText();
            //电话
            String num = ((Element)elem.elements().get(5)).getText();

            System.out.println("编号："+id+"\t姓名："+name+"\t性别："+
                    sex+"\t年龄："+
                    age+"\t地址："+address+
                    "\t电话："+num);
        }

    }
}
