package day10;


public class _Exception {
    public static void main(String[] args) {
//        Throwable t = new Throwable("头晕,感冒");
//        String info = t.toString();
//        String message = t.getMessage();
//        System.out.println(info);
//        System.out.println(message);
        try {
            div(4, 0);
        }catch (Exception e){
            System.out.println("出现异常");
            e.printStackTrace();
        }
    }

   public static void div(int a,int b) throws Exception {
       if(b==0){
           throw new Exception();
       }
       int c = a/b;
       System.out.println(c);
   }

}
