package Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 40417 on 2016/10/6 0006.
 */
public class Gather {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i = (int)(Math.random()*(list.size()-1));
        System.out.println(i);
        System.out.println(list.get(i));
        list.remove(1);
        System.out.println("移除后");
        for (int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
    }
}
