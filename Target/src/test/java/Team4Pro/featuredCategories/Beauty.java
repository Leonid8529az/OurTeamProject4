package Team4Pro.featuredCategories;

import Team4Pro.BabyCategory;
import Team4Pro.BeautyCategory;
import Team4Pro.HomeCategory;
import Team4Pro.HomePage;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beauty extends OurAPI {


    HomePage homePage;
    BeautyCategory beautyCategory;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        beautyCategory = PageFactory.initElements(driver, BeautyCategory.class);





    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedBeautyCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnBeauty();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Beauty : Target");
        waitSeconds(2);
        beautyCategory.clickOnUltraBeautyAtTarget();
        waitSeconds(2);
        scroller("7500");
        waitSeconds(2);
        beautyCategory.clickOnUltraFirstItem();
        waitSeconds(2);
        scroller("200");
        beautyCategory.clickAddToCard();

    }
}
