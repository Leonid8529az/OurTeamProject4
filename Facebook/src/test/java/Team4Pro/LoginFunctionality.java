package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFunctionality extends OurAPI {
    WebElementsLibrary webElementsLibrary;
    @BeforeMethod
    public void librarySetUp() {
        webElementsLibrary = PageFactory.initElements(driver,WebElementsLibrary.class);
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }
    @Test
    public void validCredentialsLogin(){
        webElementsLibrary.emailFeed("testFaceBookEmail@gmail.com");
        webElementsLibrary.passwordFeed("12345abc!");
        waitSeconds(0);
        webElementsLibrary.clickOnLogIn();
        System.out.println(webElementsLibrary.nameOnTheGreetingPage());
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
    }
    @Test
    public void invalidEmail() {
        webElementsLibrary.emailFeed("bread@gmail.com");
        webElementsLibrary.passwordFeed("12345abc!");
        webElementsLibrary.clickOnLogIn();
        webElementsLibrary.clickOnContinueButton();
        try {
            webElementsLibrary.clickOnContinueButton();
        } catch (Exception e) {
        }
        System.out.println(webElementsLibrary.messageOgInvalidEmail());
        Assert.assertEquals(webElementsLibrary.messageOgInvalidEmail(),"The email you entered isn’t connected to an account. Find your account and log in.");

    }
    @Test
    public void invalidPassword() {

    }

}
