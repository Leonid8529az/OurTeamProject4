package Team4Pro.weeklyAd;

import Team4Pro.*;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ViewSneakPeekOfTheOutComingWeeklyAd extends OurAPI {




    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;
    HomePage homePage;
    SpecialtyGiftCardDirectory giftCardDirectory;
    RegistryDirectory registryDirectory;
    WeeklyAdDirectory weeklyAdDirectory;



    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        giftCardDirectory = PageFactory.initElements(driver, SpecialtyGiftCardDirectory.class);
        registryDirectory = PageFactory.initElements(driver, RegistryDirectory.class);
        weeklyAdDirectory = PageFactory.initElements(driver, WeeklyAdDirectory.class);


    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }


    @Test
    public void sneakPeek() {

        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        waitSeconds(3);
        homePage.selectDeals();
        weeklyAdDirectory.selectWeeklyAdButton();
        waitSeconds(2);
        scroller("300");
        waitSeconds(2);
        Assert.assertEquals( weeklyAdDirectory.weeklyAdNewDate(), "Feb 20 - Feb 26");
        weeklyAdDirectory.selectViewTheSneakPeek();


    }
}
