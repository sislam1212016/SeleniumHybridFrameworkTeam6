package facebookMain;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class Friends extends CommonAPI{

    String url = "https://www.facebook.com";

    public void findFriends() {
        mChromeDriver.get(url);mChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        mChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        mChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        mChromeDriver.findElement(By.xpath("//a[@id='findFriendsNav']")).click();
    }
}
