package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;

public class SetCoverPic extends CommonAPIChrome {

    public void setCoverPic(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//span[@class='_1vp5']")).click();
        chromeDriver.findElement(By.xpath("//*[@class='_30vz img sp_8Uk252rpGzJ_2x sx_a260f3']")).click();
        chromeDriver.findElement(By.xpath("//*[@id='u_fetchstream_1_7']/i")).click();
    }
}
