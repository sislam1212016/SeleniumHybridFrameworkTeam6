package facebookMain;

import commonAPI.CommonAPI;

import org.openqa.selenium.By;

public class SetProfile extends CommonAPI{

    String url = "https://www.facebook.com";

    public void setProfile(){
        mChromeDriver.get(url);mChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        mChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        mChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        mChromeDriver.findElement(By.xpath("//span[@class='_1vp5']")).click();
    }
}
