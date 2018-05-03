package testBestbuy;

import commonAPI.CommonAPI;
import mainBestbuy.Account;
import mainBestbuy.BrowseToBestbuy;
import mainBestbuy.SignIn;
import org.testng.annotations.Test;

public class TestSignIn extends CommonAPI {

    @Test
    public void testSignIn() throws InterruptedException {
        BrowseToBestbuy.browseToBestbuy();
        BrowseToBestbuy.closePopUp();
        Account.account();
        Account.accountButton();
        SignIn.signInButton();
        SignIn.signIn();

    }
}
