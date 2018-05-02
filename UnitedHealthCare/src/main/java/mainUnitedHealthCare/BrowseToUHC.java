package mainUnitedHealthCare;

import commonAPI.CommonAPI;

public class BrowseToUHC extends CommonAPI {

    String uhcURL = "https://www.uhc.com/";

    public void browseToUHC(){
        wChromeDriver.get(uhcURL);
    }


}
