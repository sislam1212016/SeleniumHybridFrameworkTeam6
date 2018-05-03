package mainBestbuy;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FeaturedItem extends CommonAPI {
    public static void featuredItems() {
        String title = wGeckoDriver.findElement(By.cssSelector(".featured > h2:nth-child(1)")).getText();
        System.out.println("The " + title + " items are:");
        List<WebElement> alllinks = wGeckoDriver.findElements(By.xpath("//div[@class=\"featured\"]//a"));
        for (int i = 0; i < alllinks.size(); i++)
            System.out.println(alllinks.get(i).getText());
    }
}
