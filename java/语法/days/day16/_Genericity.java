/*把一个集合中元素全部转为大写.
    */
package day16;


import java.util.ArrayList;


public class _Genericity {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//表示只能存储字符串
        list.add("aa");
        list.add("bb");
        list.add("cc");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("大写" + str.toUpperCase());
        }

    }
}
