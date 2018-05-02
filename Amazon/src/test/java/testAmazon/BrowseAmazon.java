package testAmazon;

import mainAmazon.BrowseToAmazon;
import org.testng.annotations.Test;

public class BrowseAmazon extends BrowseToAmazon{

    @Test
    public void browseAmazon(){
        browseToAmazon();
        wChromeDriver.close();
    }
}
