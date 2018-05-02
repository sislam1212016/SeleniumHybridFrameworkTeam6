package facebookTests;

import facebookMain.BrowerLaunch;
import org.testng.annotations.Test;

public class BrowerLaunchTest extends BrowerLaunch {

    @Test
    public void launchBrower(){
        facebookBrowserLaunch();
    }
}
