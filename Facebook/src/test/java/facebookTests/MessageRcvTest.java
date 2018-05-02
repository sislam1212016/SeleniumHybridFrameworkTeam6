package facebookTests;

import facebookMain.MessageReceive;
import org.testng.annotations.Test;

public class MessageRcvTest extends MessageReceive {

    @Test
    public void recieveMessage(){
        messageReceive();
    }
}
