package facebookMain;


import commonAPI.CommonAPI;


public class BrowerLaunch extends CommonAPI{

    String url = "https://www.facebook.com";

    public void facebookBrowserLaunch() {
        mChromeDriver.get(url);
    }
}
