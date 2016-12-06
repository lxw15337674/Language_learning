package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("狗娃");
        c.add("狗剩");
        c.add("123");
        c.add("lxd");

        Iterator it = c.iterator();
        System.out.println(it.hasNext());
        System.out.println(it.next());
        System.out.println(it.next());
        it.remove();
        System.out.println(c);
    }
}
