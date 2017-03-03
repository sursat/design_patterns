package behavioural.mediatorPattern;

import java.util.Date;

/**
 * Created by prasad on 3/3/17.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}