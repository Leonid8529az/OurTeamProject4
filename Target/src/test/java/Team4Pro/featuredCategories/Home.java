package Team4Pro.featuredCategories;

import Team4Pro.BabyCategory;
import Team4Pro.HomeCategory;
import Team4Pro.HomePage;
import base.OurAPI;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home extends OurAPI {


    HomePage homePage;
    HomeCategory homeCategory;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        homeCategory = PageFactory.initElements(driver, HomeCategory.class);





    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedHomeCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnHomeCategory();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Home : Furnishings & Decor : Target");
        waitSeconds(2);
        homeCategory.clickOnHomeDecor();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Home Decor : Target");
        homeCategory.clickOnRugs();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Rugs : Target");
        waitSeconds(2);
        scroller("3000");
        waitSeconds(2);
        homeCategory.clickOnFirstItem();
        waitSeconds(2);
        scroller("200");




    }
}
