package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFunctionality extends OurAPI {

    LoginPage loginPage;
    SettingsGeneralPage settingsGeneralPage;
    SettingsSecurityPage settingsSecurityPage;
    String email = "testFaceBookEmail111@gmail.com";
    String password = "12345abc!";
    String invalidPassword = "12345678", slighlyInvalidPassword = "12345abc";
    String invalidEmail = "bread@gmail.com";
    @BeforeMethod
    public void librarySetUp() {
        loginPage = PageFactory.initElements(driver,LoginPage.class);
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }
    @Test
    public void FBTest_001(){
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
        System.out.println(loginPage.nameOnTheGreetingPage());
        Assert.assertEquals(loginPage.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
    }
    @Test
    public void FBTest_002() {
        loginPage.emailFeed(invalidEmail);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
        loginPage.clickOnContinueButton();
        try {
            loginPage.clickOnContinueButton();
        } catch (Exception e) {
        }
        System.out.println(loginPage.messageOgInvalidEmail());
        Assert.assertEquals(loginPage.messageOgInvalidEmail(),"The email you entered isn’t connected to an account. Find your account and log in.");

    }
    @Test
    public void FBTest_003() {
        loginPage.emailFeed(email);
        loginPage.passwordFeed(invalidPassword);
        loginPage.clickOnLogIn();
        System.out.println(loginPage.invalidPassword.getText());
        Assert.assertEquals(loginPage.invalidPassword.getText(),"The password you’ve entered is incorrect. Forgot Password?");
    }
    @Test
    public void FBTest_004() {
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        loginPage.clickOnDropDownButtinByProfile();
        loginPage.clickOnLogOutButton();
        loginPage.emailFeed(email);
        loginPage.passwordFeed(slighlyInvalidPassword);
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.pleaseConfirmPassword.getText(),"Please Confirm Password");
        loginPage.passwordFeed(password);
        loginPage.clickOnLoginButtonWhenThePasswordIsIncorrect();
        Assert.assertEquals(loginPage.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
    }
    @Test
    public void FBTest_005() {
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        loginPage.clickOnDropDownButtinByProfile();
        loginPage.clickOnLogOutButton();
    }
    @Test
    public void FBTest_006() {
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        loginPage.clickOnDropDownButtinByProfile();
        loginPage.clickOnLogOutButton();
        loginPage.emailFeed(invalidEmail);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.textContinueAsLeonid(),"Continue as Leonid?");
        loginPage.yesContinueClick();

    }
    @Test
    public void FBTest_007() {
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
        Assert.assertEquals(loginPage.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
        loginPage.clickOnDropDownButtinByProfile();
        loginPage.clickOnLogOutButton();
        loginPage.clickOnRecentLogins();
        loginPage.insertPasswordToThePopUp(password);
        Assert.assertEquals(loginPage.myNameForAssertion(),"Leonid Leonid");
        loginPage.clickOnAnotherLogIn();
        Assert.assertEquals(loginPage.nameOnTheGreetingPage(),"Welcome to Facebook, Leonid");
    }

}
