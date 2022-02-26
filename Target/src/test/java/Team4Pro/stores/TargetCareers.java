package Team4Pro.stores;

import Team4Pro.EmailDirectory;
import Team4Pro.HomePage;
import Team4Pro.StoreDirectory;
import base.OurAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TargetCareers extends OurAPI {

    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;
    HomePage homePage;


    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }


    @Test
    public void findCareer(){
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("5500");
        waitSeconds(3);
        homePage.career();
        storeDirectory.searchForCareer("QA engineers tester");
        waitSeconds(7);
        scroller("130");
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());




    }

}
