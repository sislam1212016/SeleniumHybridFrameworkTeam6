package facebookMain;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateAccount extends CommonAPI{

    String url = "https://www.facebook.com";

    public void createFacebookAccount() {
        mChromeDriver.get(url);
        mChromeDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd", Keys.ENTER);
        mChromeDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium", Keys.ENTER);
        mChromeDriver.findElement(By.xpath("//input[@id='u_0_i']")).sendKeys("abcd@gmail.com");
    }
}
