package facebookMain;

import commonAPI.CommonAPIChrome;

public class BrowerLaunch extends CommonAPIChrome{

    String url = "https://www.facebook.com";

    public void facebookBrowserLaunch() {
        chromeDriver.get(url);
    }
}
