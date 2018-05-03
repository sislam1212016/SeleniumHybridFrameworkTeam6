package mainBestbuy;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyBestBuyPage extends CommonAPI {
    public static void myBestBuy() {
        String title = wGeckoDriver.findElement(By.cssSelector("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/a")).getText();
        System.out.println("The " + title + " items are:");
        List<WebElement> alllinks = wGeckoDriver.findElements(By.xpath("//*[@id=\"footer\"]/div[2]/div[1]/div[1]/div[1]/ul//a"));
        for (int i = 0; i < alllinks.size(); i++)
            System.out.println(alllinks.get(i).getText());

    }
}
