package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageReceive extends CommonAPIChrome{

    public void messageReceive() {
        facebookLogin();
        WebElement element=chromeDriver.findElement(By.className("_2n_9"));
        element.click();
        chromeDriver.findElement(By.className("_2n_9 f_click")).click();
    }
}
