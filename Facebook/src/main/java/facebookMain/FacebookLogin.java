package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;

public class FacebookLogin extends CommonAPIChrome {

    String url = "https://www.facebook.com";

    public void facebookLogin() {
        chromeDriver.get(url);chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        chromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
