package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class CommonAPI {

    public WebDriver wChromeDriver;

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
        wChromeDriver = new ChromeDriver();
    }

}
