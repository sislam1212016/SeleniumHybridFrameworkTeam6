package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateAccount extends CommonAPIChrome{

    String url = "https://www.facebook.com";

    public void createFacebookAccount() {
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd", Keys.ENTER);
        chromeDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium", Keys.ENTER);
        chromeDriver.findElement(By.xpath("//input[@id='u_0_i']")).sendKeys("abcd@gmail.com");
    }
}
