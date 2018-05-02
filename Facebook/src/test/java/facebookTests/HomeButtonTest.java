package facebookTests;

import facebookMain.HomeButton;
import org.testng.annotations.Test;

public class HomeButtonTest extends HomeButton {

    @Test
    public void testHomeButton(){
        goHome();
    }
}
