package mainAmazon;

import commonAPI.CommonAPI;
import org.testng.annotations.Test;

public class BrowseToAmazon extends CommonAPI {
    String amazonURL = "https://www.amazon.com";


    public void browseToAmazon(){
        wChromeDriver.get(amazonURL);
    }
}
