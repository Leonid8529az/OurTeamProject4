package Team4Pro.featuredCategories;

import Team4Pro.EyeGlassesPath;
import Team4Pro.HomePage;
import Team4Pro.OpticalHomePage;
import Team4Pro.WomenCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Women extends OurAPI {

    HomePage homePage;
    WomenCategory womenCategory;



    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        womenCategory = PageFactory.initElements(driver, WomenCategory.class);



    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedWomenSCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnWomenCategory();
        waitSeconds(2);
        womenCategory.clickOnWomenClothing();
        waitSeconds(2);
        womenCategory.setWomenActivewear();
        waitSeconds(2);
        scroller("1600");
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Workout Clothes & Activewear for Women : Target");
        womenCategory.clickWomenFirstItem();
        scroller("200");
        waitSeconds(2);
        womenCategory.clickOnAddToCard();






    }
}
