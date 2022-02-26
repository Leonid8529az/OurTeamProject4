package Team4Pro.teamMemberServices;

import Team4Pro.BullseyeGiftCertificates;
import Team4Pro.BullseyeHomePage;
import Team4Pro.HomePage;
import Team4Pro.TeamMemberServices;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addToCardBullseyeBuyForSomeoneElseGiftCertificate extends OurAPI {

    HomePage homePage;
    TeamMemberServices teamMemberServices;
    BullseyeHomePage bullseyeHomePage;
    BullseyeGiftCertificates bullseyeGiftCertificates;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver,HomePage.class);
        teamMemberServices = PageFactory.initElements(driver, TeamMemberServices.class);
        bullseyeHomePage = PageFactory.initElements(driver, BullseyeHomePage.class);
        bullseyeGiftCertificates = PageFactory.initElements(driver, BullseyeGiftCertificates.class);


    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void addToCardBuyForYourselfBullseyeGiftCertificate () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3000");
        waitSeconds(3);
        homePage.selectTeamMemberServices();
        teamMemberServices.clickBullseyeShop();
        teamMemberServices.clickContinueToPartnerWeb();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        bullseyeHomePage.clickGiftCertificates();
        waitSeconds(3);
        bullseyeGiftCertificates.select50ShopGiftCertificate();
        Assert.assertEquals(getTitle(), "$50 Bullseye Shop Gift Certificate - Target Bullseye Shop");
       // Assert.assertEquals( teamMemberServices.returnProductCode(), "TAGGC50-PURCH");
        scroller("200");
        waitSeconds(2);
        teamMemberServices.clickOnBuyForSomeoneElse();
        waitSeconds(3);
        scroller("200");
        teamMemberServices.typeRecipientName("Lucas");
        //scroller("200");
        waitSeconds(2);
        teamMemberServices.typeRecipientEmail("lucas0101@gmail.com");
        waitSeconds(2);
        teamMemberServices.selectDateToSend();
        //Set date does NOT work



    }

}
