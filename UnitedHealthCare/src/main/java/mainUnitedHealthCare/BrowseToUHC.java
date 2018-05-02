package mainUnitedHealthCare;

import commonAPI.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BrowseToUHC extends CommonAPI {

    String uhcURL = "https://www.uhc.com/";
    String plans = "https://www.aarpmedicareplans.com";

    public void browseToUHC(){
        wChromeDriver.get(uhcURL);
    }



        public void uhcBrowserLaunch(){
            wChromeDriver.get(uhcURL);
        }

        public void findmyplans(){
            wChromeDriver.get(plans);

        }

        public void uhcLogin(){
            wChromeDriver.get(uhcURL);
            wChromeDriver.findElement(By.xpath("//div[@class='login section']//button[@id='loginmenubutton']")).click();
        }

        public void searchItems(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='q']")).sendKeys("Pharmacy", Keys.ENTER);
        }

        public void medicareSearch(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[4]/a")).click();
        }
        public void findingDoctor(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[5]/a")).click();
        }
        public void individualAndFamily(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[2]/a")).click();
        }
        public void plans(){
            individualAndFamily();
            wChromeDriver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[1]/div/div[2]/div/div/p[2]/a/span")).click();
        }
        public void answerFinding(){
            uhcLogin();
            wChromeDriver.findElement(By.xpath("//*[@id='main-content']/div[3]/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/p/span/a")).click();
        }
        public void shortTerms(){
            individualAndFamily();
            wChromeDriver.findElement(By.xpath("//*[@id='leftnavmenu']/li/ul/li[2]/ul/li[2]/a")).click();
        }
        public void dentalIns(){
            individualAndFamily();
            wChromeDriver.findElement(By.xpath("//*[@id='leftnavmenu']/li/ul/li[2]/ul/li[3]/a/span")).click();

        }

        private void employer() {
            uhcBrowserLaunch();
            wChromeDriver.findElement(By.xpath("//*[@id[span]Employers/span>")).click();


        }



    }

