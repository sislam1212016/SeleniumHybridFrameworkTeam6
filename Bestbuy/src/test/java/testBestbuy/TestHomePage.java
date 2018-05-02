package testBestbuy;

import commonAPI.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import mainBestbuy.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    @Test
    public void homepageTesting() {

        BrowseToBestbuy.browseToBestbuy();
        //Test 2 - closing PopUp Window
        // wait for the close button to appear
        BrowseToBestbuy.closePopUp();

        //Test 3 - Testing scrollbar - scrolling down
        HomePage.sleep();
        HomePage.scrollDown();
        HomePage.sleep();
        HomePage.scrollDown();
        HomePage.sleep();
        HomePage.scrollDown();
        HomePage.sleep();
        HomePage.scrollDown();
        HomePage.sleep();
        HomePage.scrollDown();
        HomePage.sleep();
        HomePage.scrollDown();
        HomePage.sleep();
        HomePage.scrollDown();

        //Test 4 - Testing scrollbar - Scrolling up
        HomePage.sleep();
        HomePage.scrollUp();
        HomePage.sleep();
        HomePage.scrollUp();
        HomePage.sleep();
        HomePage.scrollUp();
        HomePage.sleep();
        HomePage.scrollUp();
        HomePage.sleep();
        HomePage.scrollUp();
        HomePage.sleep();
        HomePage.scrollUp();
        HomePage.sleep();
        HomePage.scrollUp();
    }
}
