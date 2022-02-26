package Team4Pro.featuredCategories;

import Team4Pro.HomePage;
import Team4Pro.MenCategory;
import Team4Pro.WomenCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Men extends OurAPI {


    HomePage homePage;
    MenCategory menCategory;



    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        menCategory = PageFactory.initElements(driver, MenCategory.class);



    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedMensSCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnMenCategory();
        waitSeconds(2);
        menCategory.clickOnMenBigAndTall();
        waitSeconds(5);
        Assert.assertEquals(getTitle(), "Men's Big & Tall Clothing : Target");
        scroller("400");
        menCategory.clickMenFirstItem();
        scroller("200");
        menCategory.clickAddToCard();









    }
}
