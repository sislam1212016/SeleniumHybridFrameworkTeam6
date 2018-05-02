package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Search extends CommonAPIChrome{

    String url = "https://www.facebook.com";

    public void search() {
        chromeDriver.get(url);chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        chromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        chromeDriver.findElement(By.xpath("//*[@id='u_9_2']/input[2]")).sendKeys("find friends", Keys.ENTER);
        chromeDriver.findElement(By.xpath("//*[@id='js_6b']/form/button/i")).click();

    }
}
