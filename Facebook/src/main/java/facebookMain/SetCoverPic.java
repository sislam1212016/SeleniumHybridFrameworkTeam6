package facebookMain;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class SetCoverPic extends CommonAPI{

    String url = "https://www.facebook.com";

    public void setCoverPic(){
        mChromeDriver.get(url);mChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        mChromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        mChromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        mChromeDriver.findElement(By.xpath("//span[@class='_1vp5']")).click();
        mChromeDriver.findElement(By.xpath("//*[@class='_30vz img sp_8Uk252rpGzJ_2x sx_a260f3']")).click();
        mChromeDriver.findElement(By.xpath("//*[@id='u_fetchstream_1_7']/i")).click();
    }
}
