package mainChase;

import commonAPI.CommonAPI;

public class BrowseToChase extends CommonAPI {

    String chaseURL = "https://www.chase.com/";

    public void browseToChase(){
        wChromeDriver.get(chaseURL);
    }
}
