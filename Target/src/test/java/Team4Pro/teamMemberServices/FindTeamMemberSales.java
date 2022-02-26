package Team4Pro.teamMemberServices;

import Team4Pro.*;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindTeamMemberSales extends OurAPI {


    HomePage homePage;
    TeamMemberServices teamMemberServices;
    BullseyeHomePage bullseyeHomePage;




    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver,HomePage.class);
        teamMemberServices = PageFactory.initElements(driver, TeamMemberServices.class);
        bullseyeHomePage = PageFactory.initElements(driver, BullseyeHomePage.class);


    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void teamMembersales (){
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3000");
        waitSeconds(3);
        homePage.selectTeamMemberServices();
        teamMemberServices.clickBullseyeShop();
        teamMemberServices.clickContinueToPartnerWeb();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        bullseyeHomePage.selectBullseyeSale();
        Assert.assertEquals(getTitle(), "Sale - Target Bullseye Shop");
        waitSeconds(2);
        teamMemberServices.clickOnItem();
        waitSeconds(4);
        Assert.assertEquals( teamMemberServices.returnProductCode(), "TAG0006");
        scroller("300");
        waitSeconds(4);
        teamMemberServices.clickOnAddToCard();







    }





}
