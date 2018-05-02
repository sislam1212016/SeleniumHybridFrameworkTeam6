package testUnitedHealthCare;

import mainUnitedHealthCare.BrowseToUHC;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


    public class BrowseUHC extends BrowseToUHC {

        String uhcURL = "https://www.uhc.com/";
        String plans = "https://www.aarpmedicareplans.com";


        @Test
        public void uhcBrowserLaunch(){
            wChromeDriver.get(uhcURL);
        }

        @Test
        public void findmyplans(){
            wChromeDriver.get(plans);

        }


        @Test
        public void uhcLogin(){
            wChromeDriver.get(uhcURL);
            wChromeDriver.findElement(By.xpath("//div[@class='login section']//button[@id='loginmenubutton']")).click();
        }


    }

