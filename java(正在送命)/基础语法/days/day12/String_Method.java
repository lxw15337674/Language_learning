package day12;

/**
 * Created by 40417 on 2016/11/26 0026.
 */
public class String_Method {
    public static void main(String[] args) {
        String str = "abcdefab";
//        byte[] buf = {97,98,99};
//
//        str = new String(buf);
//        System.out.println(str);
//        str = new String(buf,1,2);
//        System.out.println(str);
//        char[] arr = {'明','天','是','圣'};
//        str = new String(arr);
//        System.out.println(str);

        System.out.println(str.charAt(3));
        System.out.println(str.indexOf("ef"));
        System.out.println(str.lastIndexOf("ab"));

    }


}
