package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class CommonAPI {
 // ================================
    /* Uncomment the driver you need  from @BeforeMethod */
 // ================================
    public WebDriver wChromeDriver; //windows Chrome
    public WebDriver wGeckoDriver; //windows Gecko
    public WebDriver mChromeDriver; //mac Chrome
    public WebDriver mGeckoDriver; //mac Gecko

    @BeforeMethod
    public void before(){
        //windows Chrome
        System.setProperty("webdriver.chrome.driver", "../Generic/browser-driver/chromedriver.exe");
        wChromeDriver = new ChromeDriver();

//        //windows Gecko
//        System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver.exe");
//        wGeckoDriver = new FirefoxDriver();
//
//        //mac Chrome
//        System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/chromedriver");
//        wGeckoDriver = new FirefoxDriver();
//
//        // mac Gecko
//        System.setProperty("webdriver.gecko.driver", "../Generic/browser-driver/geckodriver");
//        wGeckoDriver = new FirefoxDriver();

    }
}
