package mainBestbuy;

import commonAPI.CommonAPI;
import DataDriven.CreateAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Xls_Reader;

public class SignIn extends CommonAPI {

    static WebDriverWait wait = new WebDriverWait(wGeckoDriver, 1, 500);
    public static void signInButton() {
        WebElement signInB = null;
        signInB = wGeckoDriver.findElement(By.cssSelector(".lam-signIn__button"));
        wait.until(ExpectedConditions.visibilityOf(signInB)); //this will wait for elememt to be visible for 20 seconds
        signInB.click();
    }

    public static void signIn() throws InterruptedException {
        Xls_Reader reader = new Xls_Reader("..\\SeleniumHybridFrameworkTeam6\\Bestbuy\\src\\main\\java\\TestData\\bestbuy.xlsx");

        String email = reader.getCellData("Sheet1", "E-Mail Address", 2);
        System.out.println(email);

        String password = reader.getCellData("Sheet1", "Password", 2);
        System.out.println(password);
        WebElement signIn = null;
        wGeckoDriver.findElement(By.cssSelector("#fld-e")).sendKeys(email);
        Thread.sleep(2000);
        wGeckoDriver.findElement(By.cssSelector("#fld-p1")).sendKeys(password);
        Thread.sleep(2000);
        signIn = wGeckoDriver.findElement(By.cssSelector(".cia-form__submit-button"));
        wait.until(ExpectedConditions.visibilityOf(signIn)); //this will wait for elememt to be visible for 20 seconds
        signIn.click();
    }
}
