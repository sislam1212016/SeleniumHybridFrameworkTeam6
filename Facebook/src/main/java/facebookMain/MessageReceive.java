package facebookMain;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageReceive extends CommonAPI{

    String url = "https://www.facebook.com";

    public void messageReceive() {
        mChromeDriver.get(url);mChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        mChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        mChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        WebElement element=mChromeDriver.findElement(By.className("_2n_9"));
        element.click();
        mChromeDriver.findElement(By.className("_2n_9 f_click")).click();
    }
}
