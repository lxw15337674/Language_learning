package day14;

import java.util.*;

/**
 * Created by 40417 on 2016/12/6 0006.
 */
public class _toArray {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("王林");
        c.add("123");
        c.add(123);

        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));
    }

}
