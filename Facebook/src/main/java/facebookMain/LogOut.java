package facebookMain;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class LogOut extends CommonAPI{

    String url = "https://www.facebook.com";

    public void facebookLogout(){
        mChromeDriver.get(url);mChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        mChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        mChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        mChromeDriver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
        mChromeDriver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).sendKeys("Logout");
        mChromeDriver.findElement(By.xpath("//*[@id='js_7']/div/div/ul/li[14]/a/span/span")).click();
    }
}
