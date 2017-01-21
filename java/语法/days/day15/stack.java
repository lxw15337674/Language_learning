package day15;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.LinkedList;

/**
 * Created by 40417 on 2016/12/14 0014.
 */
class Stacklist{
    LinkedList list;
    public Stacklist(){
        list = new LinkedList();
    }
    public void add(Object o){
        list.push(o);
    }
    public Object pop(){
        return list.pop();

    }
    public int size(){
        return list.size();
    }
}

public class stack {
    public static void main(String[] args) {
        Stacklist list = new Stacklist();
        list.add("123");
        list.add("a");
        list.add(5);
        int size = list.size();
        for(int i=0;i<size;i++) {
            System.out.println(list.pop());
        }
    }
}
