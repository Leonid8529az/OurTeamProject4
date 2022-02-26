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

public class ShopSpecialtyGiftCardByOcassion extends OurAPI {


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
    public void selectSpecialtyGiftCard() {

        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        homePage.giftCard();
        waitSeconds(10);
        scroller("150");
        giftCardDirectory.specialtyGiftCard();
        waitSeconds(4);
        giftCardDirectory.goOnVacationGiftCard();
        waitSeconds(2);
        giftCardDirectory.SouthWAirlinesGiftCard();
        Assert.assertEquals( giftCardDirectory.nameOfTheCard(), "Southwest Airlines Gift Card (Email Delivery)");
        storeDirectory.checkOutButton();




    }
}
