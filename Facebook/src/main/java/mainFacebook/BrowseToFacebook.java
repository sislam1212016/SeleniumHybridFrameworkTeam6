package mainFacebook;

import commonAPI.CommonAPI;

public class BrowseToFacebook extends CommonAPI{

    String facebookURL = "https://www.facebook.com";

    public void browseToFacebook(){
        wChromeDriver.get(facebookURL);
    }
}
