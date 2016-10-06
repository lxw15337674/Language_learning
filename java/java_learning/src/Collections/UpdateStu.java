package Collections;

import java.util.*;
public class UpdateStu  {
    public static void main(String[] args) {
        Set ts = new TreeSet();
        ts.add("abc");
        ts.add("xyz");
        ts.add("rst");
        ts.add("2");
        Iterator it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
