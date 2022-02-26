package Team4Pro.specialtyGiftCards;

import Team4Pro.EmailDirectory;
import Team4Pro.SpecialtyGiftCardDirectory;
import Team4Pro.HomePage;
import Team4Pro.StoreDirectory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectSpecialtyGiftCard extends OurAPI {


    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;
    HomePage homePage;
    SpecialtyGiftCardDirectory giftCardDirectory;



    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        storeDirectory = PageFactory.initElements(driver,StoreDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        giftCardDirectory = PageFactory.initElements(driver, SpecialtyGiftCardDirectory.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }


    @Test
    public void findSpecialtyGiftCard() {

        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        homePage.giftCard();
        waitSeconds(10);
        scroller("150");
        giftCardDirectory.specialtyGiftCard();
        waitSeconds(4);
        Assert.assertEquals( giftCardDirectory.allGiftCardResults(), "Specialty Gift Cards (279)");
        waitSeconds(5);
        scroller("150");
        giftCardDirectory.shopAllCategory();
        waitSeconds(4);
        scroller("150");
        giftCardDirectory.specialtyBassProGiftCard();
        waitSeconds(3);
        giftCardDirectory.selectGiftCardAmount();
        waitSeconds(2);
        scroller("200");
        waitSeconds(2);
        //giftCardDirectory.selectTwoQuantity();

        storeDirectory.checkOutButton();
        Assert.assertEquals( giftCardDirectory.priceOfGiftCard(), "$50.00");





    }
}
