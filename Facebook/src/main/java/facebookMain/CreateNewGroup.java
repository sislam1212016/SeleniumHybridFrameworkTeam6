package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateNewGroup extends CommonAPIChrome {

    public void newGroup(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='fbDockChatBuddylistNub']/a/span[2]")).click();
        chromeDriver.findElement(By.xpath("//*[@id='chatsearch']/div/span/label/input")).sendKeys("New Group", Keys.ENTER);
    }
}
