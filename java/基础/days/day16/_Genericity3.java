//需求:定义一个函数可以接受任意类型的集合对象.要求接受的集合对象只能存储Integer或其父类的类型数据
package day16;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by 40417 on 2016/12/18 0018.
 */
public class _Genericity3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Number> list2 = new ArrayList<Number>();

        HashSet<String> set = new HashSet<String>();

        print(list1);
    }
    public static void print(Collection<? super Integer> c){

    }
}
