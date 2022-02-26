package Team4Pro.rayBanTests;

import Team4Pro.*;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RayBanFrames extends OurAPI {

    HomePage homePage;
    OpticalHomePage opticalHomePage;





    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver,HomePage.class);
        opticalHomePage = PageFactory.initElements(driver, OpticalHomePage.class);


    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testRayBanFramesAndTheirItems () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3000");
        waitSeconds(3);
        homePage.clickOnOptical();
        opticalHomePage.clickOnFindYourPair();
        waitSeconds(2);
        opticalHomePage.clickContinuePartnersWebsite();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        waitSeconds(3);
        Assert.assertEquals(getTitle(), "Ray-Ban Stories | Glasses, Sunglasses, Contacts & Eyewear Online | Target Optical");
        Assert.assertEquals( opticalHomePage.topNameOfSearch(), "Ray-Ban Stories");
        waitSeconds(3);
        opticalHomePage.clickOnRayBanGlasses();
        waitSeconds(2);
        scroller("200");
        opticalHomePage.clickSingleVision();
        waitSeconds(2);
        opticalHomePage.addYourLensToCard();









    }
}
