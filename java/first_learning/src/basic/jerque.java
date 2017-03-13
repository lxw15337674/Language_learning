package basic;

public class jerque {
    public static void main(String[] args) {
        String str ="";
        long starTime = System.currentTimeMillis();
        for (int i =0;i<20000;i++){
            str+=i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(str);
        System.out.println(endTime-starTime);


        StringBuilder builder = new StringBuilder("");
        starTime = System.currentTimeMillis();
        for (int i =0;i<20000;i++){
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(builder);
        System.out.println(endTime-starTime);



    }
}
