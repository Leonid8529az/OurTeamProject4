package Team4Pro.featuredCategories;

import Team4Pro.BabyCategory;
import Team4Pro.HomePage;
import Team4Pro.KidsCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baby extends OurAPI {



    HomePage homePage;
    BabyCategory babyCategory;



    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        babyCategory = PageFactory.initElements(driver, BabyCategory.class);



    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedBabySCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnBabyCategory();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Baby : Target");
        scroller("1500");
        babyCategory.clickOnBabyToys();
        waitSeconds(2);
        scroller("2000");
        waitSeconds(2);
        babyCategory.clickOnBabyFirstItem();
        waitSeconds(2);
        scroller("300");
        babyCategory.clickAddToCard();


    }

}
