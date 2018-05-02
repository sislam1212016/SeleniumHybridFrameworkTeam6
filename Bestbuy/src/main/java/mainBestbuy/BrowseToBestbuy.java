package mainBestbuy;

import commonAPI.CommonAPI;

public class BrowseToBestbuy extends CommonAPI {

    String bestbuyURL = "https://www.bestbuy.com/";

    public void browseToBestbuy(){
        wChromeDriver.get(bestbuyURL);
    }
}
