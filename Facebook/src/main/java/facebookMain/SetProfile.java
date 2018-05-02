package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;

public class SetProfile extends CommonAPIChrome{

    public void setProfile(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//span[@class='_1vp5']")).click();
    }
}
