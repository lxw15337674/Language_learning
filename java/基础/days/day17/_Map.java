package day17;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 40417 on 2016/12/19 0019.
 */
public class _Map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("汪峰","章子怡");
        map.put("父亲","儿子");
        map.put("李希望","刘思源");
        System.out.println(map);

        Map<String,String> map2 = new HashMap<String,String>();
        map2.put("杨振宁","往返");
        map2.put("阿斯顿",
                "阿斯顿");
        map.putAll(map2);
        System.out.println(map);
    }
}
