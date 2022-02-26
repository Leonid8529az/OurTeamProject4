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

public class SignIn extends OurAPI {


    EmailDirectory emaildirectory;
    HomePage homePage;


    @BeforeMethod
    public void librarySetUp() {
        emaildirectory = PageFactory.initElements(driver, EmailDirectory.class);
        homePage = PageFactory.initElements(driver,HomePage.class);

    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }
    @Test
    public void targetSignIn() {
        Assert.assertEquals(getTitle(), "Target : Expect More. Pay Less.");
        homePage.signInButtonDropDownList();
        waitSeconds(3);
        homePage.signInButton();
        waitSeconds(3);
        emaildirectory.typeEmail("ashleyindiracabrera@gmail.com");
        waitSeconds(5);
        emaildirectory.typePassword("CAshley12345");
        waitSeconds(3);
        emaildirectory.enter();







          }
    }
