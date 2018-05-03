package testBestbuy;

import commonAPI.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import mainBestbuy.MyBestBuyPage;
import org.testng.annotations.Test;

public class TestMyBestBuyPage extends CommonAPI {
    @Test
    public void bestbuyPage() {

        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        MyBestBuyPage.myBestBuy();
    }
}