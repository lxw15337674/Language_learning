package day19;

import day08.Inherit;

import java.util.ArrayList;

/**
 * Created by 40417 on 2017/1/3 0003.
 */
public class boxing_and_unboxing {
    public static void main(String[] args) {
        String str = "12";
        //字符串转换为int类型数据.
        int i = Integer.parseInt(str);
        System.out.println(i+1);

        //把数字转换为字符串
        System.out.println(Integer.toString(i));

        //把整数转换为对应的进制形式
        System.out.println(Integer.toBinaryString(10));

        //可以把字符串当作对应的进制数据
        String data = "100";
        int a = Integer.parseInt(data,2);
        System.out.println(a);

        //集合是可以存储任意对象类型数据的容易.
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        //自动装箱:自动把java的基本数据类型数据转换层对应类型数据
        int temp = 10; //基本数据类型
        Integer b = temp;

        //自动拆箱
        Integer c = new Integer(13);
        int d = c ;



    }
}
