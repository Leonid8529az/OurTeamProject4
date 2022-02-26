package Team4Pro.signUpForDeals;

import Team4Pro.EmailDirectory;
import Team4Pro.HomePage;
import Team4Pro.StoreDirectory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedCardBenefits extends OurAPI {


    StoreDirectory storeDirectory;
    HomePage homePage;


    @BeforeMethod
    public void librarySetUp() {
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }
    @Test
    public void checkOnCoupons() {

        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("4000");
        waitSeconds(5);
        homePage.clickRedCard();
        waitSeconds(3);
        storeDirectory.checkBenefits();





    }

}


