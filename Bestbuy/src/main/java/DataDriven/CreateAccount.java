package DataDriven;

import commonAPI.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import mainBestbuy.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Xls_Reader;

public class CreateAccount extends CommonAPI {

    static WebDriverWait wait = new WebDriverWait(wGeckoDriver, 10, 500);
    public static void createAccount() {

        Xls_Reader reader = new Xls_Reader("C:\\Users\\apoor\\IdeaProjects\\SeleniumHybridFrameworkTeam6\\Bestbuy\\src\\main\\java\\TestData\\bestbuy.xlsx");

        String firstName = reader.getCellData("Sheet1", "First Name", 2);
        System.out.println(firstName);

        String lastName = reader.getCellData("Sheet1", "Last Name", 2);
        System.out.println(lastName);

        String email = reader.getCellData("Sheet1", "E-Mail Address", 2);
        System.out.println(email);

        String password = reader.getCellData("Sheet1", "Password", 2);
        System.out.println(firstName);

        String confirmPass = reader.getCellData("Sheet1", "Confirm Password", 2);
        System.out.println(confirmPass);

        String phone = reader.getCellData("Sheet1", "Phone Number", 2);
        System.out.println(phone);

        WebElement createAccount = null;
        wGeckoDriver.findElement(By.cssSelector("#fld-firstName")).sendKeys("team");
        HomePage.sleep();

        wGeckoDriver.findElement(By.cssSelector("#fld-lastName")).sendKeys("selenium6");
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-e")).sendKeys("team6.selenium@gmail.com");
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-p1")).sendKeys("TEam@612345");
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-p2")).sendKeys("TEam@612345");
        HomePage.sleep();
        wGeckoDriver.findElement(By.cssSelector("#fld-phone")).sendKeys("123456789");
        HomePage.sleep();
        createAccount = wGeckoDriver.findElement(By.cssSelector(".cia-form__submit-button"));
        wait.until(ExpectedConditions.visibilityOf(createAccount)); //this will wait for elememt to be visible for 20 seconds
       // createAccount.click();


    }


}
