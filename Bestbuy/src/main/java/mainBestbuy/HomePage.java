package mainBestbuy;

import commonAPI.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage extends CommonAPI {
    public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) wGeckoDriver;
        js.executeScript("window.scrollBy(0,500)");
    }

    public static void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) wGeckoDriver;
        js.executeScript("window.scrollBy(0,-500)");
    }

    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
