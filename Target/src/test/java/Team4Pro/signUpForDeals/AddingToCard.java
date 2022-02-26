package Team4Pro.signUpForDeals;

import Team4Pro.EmailDirectory;
import Team4Pro.HomePage;
import Team4Pro.StoreDirectory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddingToCard extends OurAPI {
    HomePage homePage;


    @BeforeMethod
    public void librarySetUp() {
        homePage = PageFactory.initElements(driver,HomePage.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }
    @Test
    public void addToCard(){
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        homePage.searchBar("huggies diaper size 3");
        waitSeconds(3);
        homePage.searchButton();
        Assert.assertEquals( homePage.resultHeading(), "30 results for “huggies diaper size 3”");
        scroller("300");
        waitSeconds(8);
        homePage.itemToCard();
        waitSeconds(3);
        scroller("300");
        homePage.addToCard();





    }

}
