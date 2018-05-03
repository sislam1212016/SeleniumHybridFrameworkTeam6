package testBestbuy;

import commonAPI.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import mainBestbuy.FeaturedItem;
import org.testng.annotations.Test;

public class TestFeaturedItems extends CommonAPI {
    @Test
    public void TestFeatured() {
        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        FeaturedItem.featuredItems();

    }
}
