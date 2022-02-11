package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFunctionality extends OurAPI {
    WebElementsLibrary webElementsLibrary;
    String email = "testFaceBookEmail111@gmail.com";
    String password = "12345abc!";
    String invalidPassword = "12345678", slighlyInvalidPassword = "12345abc";
    String invalidEmail = "bread@gmail.com";
    @BeforeMethod
    public void librarySetUp() {
        webElementsLibrary = PageFactory.initElements(driver,WebElementsLibrary.class);
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }
    @Test
    public void FBTest_001(){
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLogIn();
        System.out.println(webElementsLibrary.nameOnTheGreetingPage());
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
    }
    @Test
    public void FBTest_002() {
        webElementsLibrary.emailFeed(invalidEmail);
        webElementsLibrary.passwordFeed(password);
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
    public void FBTest_003() {
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(invalidPassword);
        webElementsLibrary.clickOnLogIn();
        System.out.println(webElementsLibrary.invalidPassword.getText());
        Assert.assertEquals(webElementsLibrary.invalidPassword.getText(),"The password you’ve entered is incorrect. Forgot Password?");
    }
    @Test
    public void FBTest_004() {
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLogIn();
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.clickOnLogOutButton();
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(slighlyInvalidPassword);
        webElementsLibrary.clickOnLogIn();
        Assert.assertEquals(webElementsLibrary.pleaseConfirmPassword.getText(),"Please Confirm Password");
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLoginButtonWhenThePasswordIsIncorrect();
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
    }
    @Test
    public void FBTest_005() {
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLogIn();
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.clickOnLogOutButton();
    }
    @Test
    public void FBTest_006() {
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLogIn();
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.clickOnLogOutButton();
        webElementsLibrary.emailFeed(invalidEmail);
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLogIn();
        Assert.assertEquals(webElementsLibrary.textContinueAsLeonid(),"Continue as Leonid?");
        webElementsLibrary.yesContinueClick();

    }
    @Test
    public void FBTest_007() {
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLogIn();
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.clickOnLogOutButton();
        webElementsLibrary.clickOnRecentLogins();
        webElementsLibrary.insertPasswordToThePopUp(password);
        Assert.assertEquals(webElementsLibrary.myNameForAssertion(),"Leonid Leonid");
        webElementsLibrary.clickOnAnotherLogIn();
        Assert.assertEquals(webElementsLibrary.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
    }

}
