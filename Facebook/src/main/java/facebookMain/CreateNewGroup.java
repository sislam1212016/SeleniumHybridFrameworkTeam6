package facebookMain;


import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateNewGroup extends CommonAPI {

    String url = "https://www.facebook.com";

    public void newGroup(){
        mChromeDriver.get(url);mChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        mChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        mChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        mChromeDriver.findElement(By.xpath("//*[@id='fbDockChatBuddylistNub']/a/span[2]")).click();
        mChromeDriver.findElement(By.xpath("//*[@id='chatsearch']/div/span/label/input")).sendKeys("New Group", Keys.ENTER);
    }
}
