package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;

public class OpenChatBox extends CommonAPIChrome{

    public void chatBox(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='fbDockChatBuddylistNub']/a/span[2]")).click();
    }
}
