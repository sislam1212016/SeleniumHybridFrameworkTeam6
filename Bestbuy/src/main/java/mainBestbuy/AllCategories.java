package mainBestbuy;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AllCategories extends CommonAPI {
    public static void allCategories() {
        String title = wGeckoDriver.findElement(By.cssSelector(".shopby > h2:nth-child(1)")).getText();
        System.out.println("The " + title + " items are:");
        List<WebElement> shopby = wGeckoDriver.findElements(By.xpath("//div[@class=\"shopby\"]//li[@class=\"js-navitem sub-nav-parent taphover\"]"));
        for (int i = 0; i < shopby.size(); i++)
            System.out.println(shopby.get(i).getText());

    }
}
