package Team4Pro.signUpForDeals;

import Team4Pro.EmailDirectory;
import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LatestDeals extends OurAPI {
    EmailDirectory emaildirectory;

    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }



    @Test
    public void addingEmailForLatestDeal(){

        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        scroller("3000");
        waitSeconds(2);
        scroller("-300");
        emaildirectory.searchElement("ashleyindiracabrera@gmail.com");
        waitSeconds(3);
        Assert.assertEquals( emaildirectory.returnText(), "Thank you! Watch your inbox for deals, new items and more.");



    }

}
