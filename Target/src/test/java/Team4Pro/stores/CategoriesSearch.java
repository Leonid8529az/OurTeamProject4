package Team4Pro.stores;

import Team4Pro.EmailDirectory;
import Team4Pro.HomePage;
import Team4Pro.StoreDirectory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CategoriesSearch extends OurAPI {

    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;
    HomePage homePage;


    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }
    @Test
    public void SelectBrandGiftCard(){
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        homePage.searchingCategories();
        waitSeconds(3);
        homePage.womenCategories();
        waitSeconds(2);
        homePage.womenCategoryForClothing();
        waitSeconds(2);
        homePage.womenActivewear();
        waitSeconds(2);
        homePage.sportBras();
        waitSeconds(10);
        scroller("-800");
        waitSeconds(10);
        Assert.assertEquals( homePage.completeResults(), "116 results");
        waitSeconds(3);







    }

}

