package facebookTests;

import facebookMain.CreateAccount;
import org.testng.annotations.Test;

public class CreateAccountTest extends CreateAccount {

    @Test
    public void account(){
        createFacebookAccount();
    }
}
