package facebookTests;

import facebookMain.LogOut;
import org.testng.annotations.Test;

public class LogOutTest extends LogOut {

    @Test
    public void logout(){
        facebookLogout();
    }
}
