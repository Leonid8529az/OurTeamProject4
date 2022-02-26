package Team4Pro.featuredCategories;

import Team4Pro.BeautyCategory;
import Team4Pro.HomePage;
import Team4Pro.VideoGamesCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VideoGames extends OurAPI {


    HomePage homePage;
    VideoGamesCategory videoGamesCategory;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        videoGamesCategory = PageFactory.initElements(driver, VideoGamesCategory.class);





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
        homePage.clickOnVideoGames();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Video Games : Target");
        waitSeconds(2);
        scroller("200");
        videoGamesCategory.clickOnKitchenXboxSeries();
        waitSeconds(2);
        scroller("4000");
        waitSeconds(2);
        videoGamesCategory.clickOnFirstItem();
        waitSeconds(2);
        scroller("300");
        videoGamesCategory.clickAddToCard();






    }
}
