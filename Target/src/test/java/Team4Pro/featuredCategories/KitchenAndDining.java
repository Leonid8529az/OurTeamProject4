package Team4Pro.featuredCategories;

import Team4Pro.HomeCategory;
import Team4Pro.HomePage;
import Team4Pro.KitchenAndDiningCategory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KitchenAndDining extends OurAPI {


    HomePage homePage;
   KitchenAndDiningCategory kitchenAndDiningCategory;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        kitchenAndDiningCategory = PageFactory.initElements(driver, KitchenAndDiningCategory.class);





    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void testFeaturedKitchenAndDiningCategory () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3700");
        waitSeconds(4);
        homePage.clickOnKitchenAndDining();
        waitSeconds(2);
        //Assert.assertEquals(getTitle(), "Kitchen & Dining : Target");
        waitSeconds(2);
        kitchenAndDiningCategory.clickOnKitchenAppliances();
        waitSeconds(3);
        Assert.assertEquals(getTitle(), "Kitchen Appliances : Target");
        kitchenAndDiningCategory.clickOnMixersAndAttachments();
        waitSeconds(2);
        scroller("700");
        waitSeconds(5);
        kitchenAndDiningCategory.clickOnFirstItem();
        waitSeconds(2);
        scroller("300");
        kitchenAndDiningCategory.clickAddToCard();




    }
}
