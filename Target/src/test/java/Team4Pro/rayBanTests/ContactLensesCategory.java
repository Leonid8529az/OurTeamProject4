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

public class ContactLensesCategory extends OurAPI {


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
    public void testContactLensesCategoryAndtheirItems () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3000");
        waitSeconds(3);
        homePage.clickOnOptical();
        scroller("400");
        waitSeconds(3);
        opticalHomePage.selectContactLenses();
        waitSeconds(2);
        opticalHomePage.clickContinuePartnersWebsite();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        waitSeconds(3);
        Assert.assertEquals(getTitle(), "Contact Lenses Online | Target Optical");
        scroller("300");
        Assert.assertEquals(eyeGlassesPath.findTitleOfList(), "Contact Lenses Online");
        eyeGlassesPath.addFirstItem();
        scroller("400");
        eyeGlassesPath.selectSameForBothEyes();





    }

}
