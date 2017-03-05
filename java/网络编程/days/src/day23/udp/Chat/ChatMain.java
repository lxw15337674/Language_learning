package day23.udp.Chat;

/**
 * Created by 40417 on 2017/1/22 0022.
 */
public class ChatMain {
    public static void main(String[] args) {
        ChatReceive chatReceive = new ChatReceive();
        chatReceive.start();

        ChatSender chatSender = new ChatSender();
        chatSender.start();
    }
}
