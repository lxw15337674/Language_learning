package day15;


import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by 40417 on 2016/12/14 0014.
 */
public class _listIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("lol");
        list.add(123);
        list.add("美美");
        list.add("lol");
        ListIterator li = list.listIterator();
        System.out.println(li.next());
        System.out.println(li.next());
        System.out.println(li.previous());
        System.out.println(li.next());
        System.out.println(li.hasPrevious());
        System.out.println(li.next());
    }




}
