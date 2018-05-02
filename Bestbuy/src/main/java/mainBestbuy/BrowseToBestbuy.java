package mainBestbuy;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowseToBestbuy extends CommonAPI {

     static String bestbuyURL = "https://www.bestbuy.com/";

  static WebDriverWait wait = new WebDriverWait(wGeckoDriver, 1, 500);


    public static void browseToBestbuy() {
        wGeckoDriver.get(bestbuyURL);

    }

    public static void closePopUp() {

        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".email-submission-modal .modal-header button.close")));
        closeButton.click();
    }

}
