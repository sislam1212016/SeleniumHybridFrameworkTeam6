package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;

public class Friends extends CommonAPIChrome {

    String url = "https://www.facebook.com";

    public void findFriends() {
        chromeDriver.get(url);chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        chromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        chromeDriver.findElement(By.xpath("//a[@id='findFriendsNav']")).click();
    }
}
