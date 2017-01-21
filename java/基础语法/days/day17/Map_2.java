package day17;

import java.util.*;

/**
 * Created by 40417 on 2017/1/2 0002.
 */
public class Map_2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("汪峰","章子怡");
        map.put("文章","玛丽");
        map.put("注册","阿斯顿");
        map.put("成龙","林凤娇");
        System.out.println(map);

//        //map遍历方法1 缺点:有键没有值
//        Set<String> keys = map.keySet();//把map集合中的键保存到set中
//        Iterator<String> it = keys.iterator();
//        while(it.hasNext()){
//            String key = it.next();
//            System.out.println("键:"+key+" 值:"+map.get(key));
//        }

        //map遍历方法2  缺点:只有值
        Collection<String> c = map.values();
        Iterator<String> it2 = c.iterator();
        while(it2.hasNext()){
            System.out.println("值:"+ it2.next());
        }


    }
}
