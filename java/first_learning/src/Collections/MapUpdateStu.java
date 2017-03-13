package Collections;


import java.util.*;

/**
 * Created by 40417 on 2016/10/6 0006.
 */
public class MapUpdateStu {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("01", "li");
        map.put("02", "wei");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("02"));
    }
}
