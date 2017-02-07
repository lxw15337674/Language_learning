package day18;

/**
 * Created by 40417 on 2017/1/3 0003.
 */
public class _regular {
    public static void main(String[] args) {
        String str = "如有需求请联系:13556082123如有需求请联系:13556082123如有需求请联系:13556082123如有需求请联系:13556082123";
        String reg = "1[345678]\\d{9}";
        String a = str.replaceAll(reg,"****");
        System.out.println(a);


        str = "我我要要做做做项项项项目目目目目目";
        str = str.replaceAll("(.)\\1+","$1");
        System.out.println(str);


    }
}
