package before;

/**
 * Created by 40417 on 2016/11/17 0017.
 */
class People{
    private String sex;
    private String name;
    public void setsex(String s){
        if(s.equals("男")||s.equals("女"))
        {
            sex = s;
        }else{
            sex = "男";
    }
    }
    public String getSex() {
        return sex;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        People s = new People();
        s.setsex("李希望");
        String a = s.getSex();
        System.out.println(a);


    }
}
