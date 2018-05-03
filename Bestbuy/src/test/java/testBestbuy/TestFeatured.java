package testBestbuy;

import commonAPI.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import mainBestbuy.FeaturedOffers;
import org.testng.annotations.Test;

public class TestFeatured extends CommonAPI{

    @Test
    public void testFeatured(){

        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        FeaturedOffers.featuredOffers();
    }
}
