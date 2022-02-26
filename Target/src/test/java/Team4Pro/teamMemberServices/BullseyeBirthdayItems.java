package Team4Pro.teamMemberServices;

import Team4Pro.BullseyeHomePage;
import Team4Pro.HomePage;
import Team4Pro.TeamMemberServices;
import base.OurAPI;
import javafx.scene.control.ScrollToEvent;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BullseyeBirthdayItems extends OurAPI {


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
    public void teamMemberSales () {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3000");
        waitSeconds(3);
        homePage.selectTeamMemberServices();
        teamMemberServices.clickBullseyeShop();
        teamMemberServices.clickContinueToPartnerWeb();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        scroller("1000");
        bullseyeHomePage.clickOnBirthday();


    }

}
