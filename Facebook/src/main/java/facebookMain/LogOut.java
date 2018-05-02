package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;

public class LogOut extends CommonAPIChrome{

    public void facebookLogout(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
        chromeDriver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).sendKeys("Logout");
        chromeDriver.findElement(By.xpath("//*[@id='js_7']/div/div/ul/li[14]/a/span/span")).click();
    }
}
