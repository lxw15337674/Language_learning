/**
 * Created by 40417 on 2016/9/25 0025.
 */
public class Division {
    public static void main(String[] args) {
        String str = new String("abc,def,ghi,gkl");
        String[] newstr = str.split(",");
        for(int i = 0;i <newstr.length;i++){
            System.out.println(newstr[i]);
        }
        System.out.println();
        String[] newstr2 = str.split(",",2);
        for(int i = 0;i <newstr2.length;i++){
            System.out.println(newstr2[i]);
        }
    }
}
