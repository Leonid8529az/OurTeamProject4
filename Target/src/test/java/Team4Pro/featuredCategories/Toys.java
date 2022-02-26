package Team4Pro.featuredCategories;

import Team4Pro.HomePage;
import Team4Pro.ToysCategory;
import Team4Pro.VideoGamesCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Toys extends OurAPI {



    HomePage homePage;
    ToysCategory toysCategory;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        toysCategory = PageFactory.initElements(driver, ToysCategory.class);





    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedVideoGamesCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnToys();
        waitSeconds(2);
        scroller("300");
        Assert.assertEquals(getTitle(), "Toys : Target");
        waitSeconds(2);
        scroller("400");
        waitSeconds(3);
        toysCategory.clickOnActionFigures();
        toysCategory.selectActionFigures();
        waitSeconds(2);
        scroller("200");
        toysCategory.clickOnMarvel();
        waitSeconds(2);
        toysCategory.selectFirstItem();
        waitSeconds(2);
        toysCategory.clickOnAddToCard();






    }
}
