package Team4Pro.featuredCategories;

import Team4Pro.BabyCategory;
import Team4Pro.ElectronicsCategory;
import Team4Pro.HomePage;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Electronics extends OurAPI {


    HomePage homePage;
    ElectronicsCategory electronicsCategory;



    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        electronicsCategory = PageFactory.initElements(driver, ElectronicsCategory.class);



    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedElectronicsCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnElectronic();
        scroller("400");

        waitSeconds(3);
        Assert.assertEquals(getTitle(), "Electronics : Target");
        scroller("300");
        electronicsCategory.clickOnTVsAndHomeTheater();
        waitSeconds(2);
        scroller("2400");
        waitSeconds(4);
        electronicsCategory.clickOnElectronicFirstItem();
        scroller("300");
        waitSeconds(2);
        electronicsCategory.clickAddToCard();


    }
}
