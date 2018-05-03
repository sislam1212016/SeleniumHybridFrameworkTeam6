package testBestbuy;

import commonAPI.CommonAPI;
import mainBestbuy.BrowseToBestbuy;
import mainBestbuy.CreditCardPage;
import org.testng.annotations.Test;

public class TestCreditCard extends CommonAPI {
    @Test
    public void testCredit(){
        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        CreditCardPage.creditCard();
    }
}
