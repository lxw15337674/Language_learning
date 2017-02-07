package day11;

class NoMonyException extends Exception{
    public NoMonyException(String message){
        super(message);
    }
}

public class Custom_exception_class2 {
    public static void main(String[] args) {
        try {
            eat(5);
        }catch (NoMonyException e){
            e.printStackTrace();
            System.out.println("吃不上饭了");
        }
    }
    public static void eat(int money) throws NoMonyException{
        if (money<10){
            throw new NoMonyException("没有钱");
        }
        System.out.println("吃上饭");
    }
}
