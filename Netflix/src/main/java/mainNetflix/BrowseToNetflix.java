package mainNetflix;

import commonAPI.CommonAPI;

public class BrowseToNetflix extends CommonAPI {

    String netflixURL = "https://www.netflix.com";

    public void browseToNetflix(){
        wChromeDriver.get(netflixURL);
    }
}
