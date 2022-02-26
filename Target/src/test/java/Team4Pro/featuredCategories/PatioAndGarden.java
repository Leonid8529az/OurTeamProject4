package Team4Pro.featuredCategories;

import Team4Pro.HomeCategory;
import Team4Pro.HomePage;
import Team4Pro.PatioAndGardenCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PatioAndGarden extends OurAPI {


    HomePage homePage;
    PatioAndGardenCategory patioAndGardenCategory;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        patioAndGardenCategory = PageFactory.initElements(driver, PatioAndGardenCategory.class);





    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedPatioAndGardenCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnPatioAndGarden();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Patio & Garden : Target");
        waitSeconds(2);
        patioAndGardenCategory.clickOnPatioFurniture();
        waitSeconds(2);
        patioAndGardenCategory.clickOnPatioTables();
        waitSeconds(2);
        Assert.assertEquals(getTitle(), "Patio Tables : Target");
        scroller("500");
        waitSeconds(4);
        patioAndGardenCategory.clickOnFirstItem();
        waitSeconds(2);
        patioAndGardenCategory.AddToCart();






    }

}
