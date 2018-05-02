package facebookMain;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class HomeButton extends CommonAPI{

    String url = "https://www.facebook.com";

    public void goHome(){
        wChromeDriver.get(url);wChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        wChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        wChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        wChromeDriver.findElement(By.xpath("//a[@class='_2s25']")).click();
    }
}
