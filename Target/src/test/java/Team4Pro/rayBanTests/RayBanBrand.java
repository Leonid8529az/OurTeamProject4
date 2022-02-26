package Team4Pro.rayBanTests;

import Team4Pro.EyeGlassesPath;
import Team4Pro.HomePage;
import Team4Pro.OpticalHomePage;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RayBanBrand extends OurAPI {


    HomePage homePage;
    OpticalHomePage opticalHomePage;
    EyeGlassesPath eyeGlassesPath;





    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver,HomePage.class);
        opticalHomePage = PageFactory.initElements(driver, OpticalHomePage.class);
        eyeGlassesPath = PageFactory.initElements(driver, EyeGlassesPath.class);


    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testRayBanShopByBrand () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3000");
        waitSeconds(3);
        homePage.clickOnOptical();
        scroller("1400");
        waitSeconds(5);
        opticalHomePage.selectCatAndJackBrand();
        waitSeconds(2);
        opticalHomePage.clickContinuePartnersWebsite();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        waitSeconds(3);
        Assert.assertEquals(getTitle(), "Cat & Jack Sunglasses and Eyeglasses | Target Optical");
        Assert.assertEquals( opticalHomePage.topNameOfSearch(), "Cat and Jack Glasses");
        waitSeconds(3);
        scroller("500");
        eyeGlassesPath.clickOnItem();
        scroller("600");
        waitSeconds(2);
        eyeGlassesPath.clickOnSVComfortLightKids();
        waitSeconds(2);
        eyeGlassesPath.addGlassesToCard();



    }
}
