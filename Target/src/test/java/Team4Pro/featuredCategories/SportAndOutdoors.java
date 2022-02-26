package Team4Pro.featuredCategories;

import Team4Pro.BeautyCategory;
import Team4Pro.HomePage;
import Team4Pro.ToysCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SportAndOutdoors extends OurAPI {


    HomePage homePage;
    SportAndOutdoors sportAndOutdoors;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        sportAndOutdoors = PageFactory.initElements(driver, SportAndOutdoors.class);





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
        homePage.clickOnSportAndOutdoors();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Sport & Outdoors : Target");




        waitSeconds(2);








    }
}
