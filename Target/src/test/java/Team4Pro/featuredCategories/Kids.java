package Team4Pro.featuredCategories;

import Team4Pro.HomePage;
import Team4Pro.KidsCategory;
import Team4Pro.MenCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Kids extends OurAPI {


    HomePage homePage;
    KidsCategory kidsCategory;



    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        kidsCategory = PageFactory.initElements(driver, KidsCategory.class);



    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedKidsSCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnKidsCategory();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Kids : Kids' Clothes : Target");
        scroller("400");
        kidsCategory.clickOnTweenClothing();
        waitSeconds(3);
        scroller("3500");
        waitSeconds(10);
        kidsCategory.clickOnKidsFirstItem();
        waitSeconds(2);
        scroller("200");
        kidsCategory.clickAddToCard();





    }
}
