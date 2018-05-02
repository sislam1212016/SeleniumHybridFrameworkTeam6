package testBestbuy;

import commonAPI.CommonAPI;
import DataDriven.CreateAccount;
import mainBestbuy.Account;
import mainBestbuy.BrowseToBestbuy;
import org.testng.annotations.Test;

public class TestCreateAccount extends CommonAPI {

    @Test
    public void account() throws InterruptedException {
        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        Account.account();
        Account.accountButton();
        CreateAccount.createAccount();
    }
}
