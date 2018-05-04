package facebookMain;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Search extends CommonAPI{

    String url = "https://www.facebook.com";

    public void search() {
        mChromeDriver.get(url);mChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        mChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        mChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        mChromeDriver.findElement(By.xpath("//*[@id='u_9_2']/input[2]")).sendKeys("find friends", Keys.ENTER);
        mChromeDriver.findElement(By.xpath("//*[@id='js_6b']/form/button/i")).click();

    }
}
