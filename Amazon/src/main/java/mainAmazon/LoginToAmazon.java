package mainAmazon;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;

public class LoginToAmazon extends CommonAPI {

    String amazonURL = "https://www.amazon.com";

    public void mainAmazonLogin(){
        wChromeDriver.get(amazonURL);
        wChromeDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        wChromeDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@email.com");
        wChromeDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        wChromeDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
        wChromeDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }
}
