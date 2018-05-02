package testChase.Base;

import Common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Chase extends CommonAPI {

    public WebDriver webDriver;

    String url = "https://www.chase.com";

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sohaib\\IdeaProjects\\testing\\driver\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Test//test1
    public void launchChase(){
        webDriver.get(url);
    }

    @Test//test2
    public void loginToChase(){
        webDriver.get(url);
        webDriver.findElement(By.name("user_name")).sendKeys("Base.Chase@gmail.com");
        webDriver.findElement(By.id("usr_password_home")).sendKeys("password", Keys.ENTER);
    }

    @Test//test3
    public void chaseLoginviamenu(){
        webDriver.get(url);
        webDriver.findElement(By.xpath("//header[@data-feature='header']//a[@id='skip-sidemenu']")).click();
        webDriver.findElement(By.cssSelector(".chaseanalytics-track-link.signInBtn")).click();
    }

    @Test//test4
    public void chaseRefresh(){
        webDriver.get(url);
        webDriver.navigate().refresh();
    }

    @Test//test5
    public void checkingAccounts(){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Checking Accounts")).click();
    }

    @Test//test6
    public void chaseImplicitWait(){
        webDriver.get(url);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.close();
    }

    @Test//test7
    public void chaseSavings(){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Savings Accounts and CDs ")).click();
    }

    @Test//test8
    public void closeChaseBrowser() {
        webDriver.get(url);
        webDriver.close();
    }

    @Test//test9
    public void chasePrivacyConditions(){
        webDriver.get(url);
        webDriver.findElement(By.name("fm_privacy")).click();
    }

    @Test//test10
    public void chaseTermsofUse(){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Deposit and Prepaid Account Agreements")).click();
    }

    @Test//test11
    public void OnlineBanking(){
        webDriver.get(url);
        webDriver.findElement(By.name(" regular-link chaseanalytics-track-link")).click();
    }

    @Test//test12
    public void maximizeChase(){
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

    @Test//test13
    public void helpHomeOwners(){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Explore products")).click();
    }

    @Test//test14
    public void chaseSiteMap(){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Site map ")).click();
    }

    @Test//test15
    public void ATMandBRanch(){
        webDriver.get(url);
        webDriver.findElement(By.cssSelector("body.home")).click();
    }

    @Test//test16
    public void mobileBanking() {
        webDriver.get(url);
        webDriver.findElement(By.linkText("Mobile Banking")).click();
    }

    @Test//test17
    public void studentCenter(){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Student Center")).click();
    }

    @Test//test18
    public void depositAndPrepaid(){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Deposit and Prepaid Account Agreements")).click();
    }

    @Test
    public void chaseSpanish (){
        webDriver.get(url);
        webDriver.findElement(By.linkText("Forgot username/password?")).click();
    }
}
