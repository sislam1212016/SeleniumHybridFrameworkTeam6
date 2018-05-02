package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;

public class EditProfile extends CommonAPIChrome {

    public void editProfile(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//span[@class='_1vp5']")).click();
        chromeDriver.findElement(By.xpath("//*[@id='u_fetchstream_1_h']")).click();
        chromeDriver.findElement(By.xpath("//a[@id='u_0_1k']")).click();
    }
}
