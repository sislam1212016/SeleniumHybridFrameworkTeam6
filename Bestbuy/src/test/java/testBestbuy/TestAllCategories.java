package testBestbuy;

import commonAPI.CommonAPI;
import mainBestbuy.AllCategories;
import mainBestbuy.BrowseToBestbuy;
import org.testng.annotations.Test;

public class TestAllCategories extends CommonAPI{
    @Test
    public void testCategories(){
        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        AllCategories.allCategories();

    }
}
