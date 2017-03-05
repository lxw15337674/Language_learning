package day11;

/**
 * Created by 40417 on 2016/11/22 0022.
 */
//
class NoIpException extends Exception{
    public NoIpException(String message){
        super(message);
    }
}
public class Custom_exception_class {
    public static void main(String[] args) throws NoIpException {
        String ip = "192.168.10.100;";
        ip = null;
//        try {
        feiQ(ip);
//        }catch (NoIpException e){
//            e.printStackTrace();
//            System.out.println("插上网线啊");
//        }

    }
    public static void feiQ(String ip) throws NoIpException {
        if(ip==null){
            throw new NoIpException("没有插网线");
        }
        System.out.println("正常显示好友列表");
    }
}
