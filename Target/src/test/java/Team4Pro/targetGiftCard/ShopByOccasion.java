package Team4Pro.targetGiftCard;

import Team4Pro.*;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopByOccasion extends OurAPI {

    EmailDirectory emaildirectory;
    StoreDirectory storeDirectory;
    HomePage homePage;
    SpecialtyGiftCardDirectory giftCardDirectory;
    TargetGiftCards targetGiftCards;



    @BeforeMethod
    public void librarySetUp() {
    emaildirectory = PageFactory.initElements(driver, EmailDirectory .class);
    storeDirectory = PageFactory.initElements(driver,StoreDirectory .class);
    homePage = PageFactory.initElements(driver,HomePage .class);
    giftCardDirectory = PageFactory.initElements(driver, SpecialtyGiftCardDirectory .class);
    targetGiftCards = PageFactory.initElements(driver, TargetGiftCards .class);
}
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }


    @Test
    public void shopByOccasion() {

        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        homePage.giftCard();
        waitSeconds(10);
        scroller("150");
        targetGiftCards.clickTargetGiftCards();
        waitSeconds(4);
        targetGiftCards.clickBabyTargetGiftCard();
        Assert.assertEquals(targetGiftCards.setAllBabyResults(),"11 results");
        targetGiftCards.clickBabyGiftCard();
        waitSeconds(3);
        //giftCardDirectory.selectQuantity();
        giftCardDirectory.selectTwoQuantity();
        waitSeconds(2);
        storeDirectory.checkOutButton();





    }
}
