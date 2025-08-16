package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseclass.libarrayclass;
import Pages.FlipkartResultPage;
import Pages.FlipkartSearchpage;
import Utilities.Reusablefunctions;


public class FlipkartSearchtest extends libarrayclass {
	Reusablefunctions re;
    FlipkartSearchpage search;
   

   

    @BeforeTest
    public void openapp() {
    	
    	
        initializeBrowser();
        openApplication();
        re = new Reusablefunctions(driver);
        search = new FlipkartSearchpage(driver);
       
    }

    @Test(priority =1)
    public void searchmobile() throws IOException {
        search.search("Mobiles");
        
        search.clicksearch(); 
        
        re.takescreenshot("src/test/resources/screenshot/flipkartsearch.png");
    }
    
    

    @AfterTest
    public void closeapp() throws IOException {
        
        re.getTitle();
        closeBrowser();
        
    }
}
