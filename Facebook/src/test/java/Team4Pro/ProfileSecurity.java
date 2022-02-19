package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileSecurity extends OurAPI {
    String email = "testFaceBookEmail111@gmail.com";
    String password = "12345abc!";
    String newPass = "12345abcd@";
    SettingsSecurityPage settingsSecurityPage;
    LoginPage loginPage;
    SettingsGeneralPage settingsGeneralPage;
    @BeforeMethod
    public void librarySetUp() {
        settingsSecurityPage = PageFactory.initElements(driver,SettingsSecurityPage.class);
        loginPage = PageFactory.initElements(driver,LoginPage.class);
        settingsGeneralPage = PageFactory.initElements(driver,SettingsGeneralPage.class);
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void FBTest_008() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        settingsSecurityPage.securityAndLogin();
        waitSeconds(2);
        switchToIFrame(settingsGeneralPage.iFrame);
        Assert.assertEquals(settingsSecurityPage.getTextSecurityAndLogin(),"Security and Login");
        settingsSecurityPage.passwordEditButton();
        Assert.assertEquals(settingsSecurityPage.getTextOldPassword(),"Current");
        settingsSecurityPage.oldPassword(password);
        Assert.assertEquals(settingsSecurityPage.getTextNewPassword(),"New");
        settingsSecurityPage.newPassword(newPass);
        Assert.assertEquals(settingsSecurityPage.getTextConfirmPassword(),"Re-type new");
        settingsSecurityPage.confirmPassword(newPass);
        settingsSecurityPage.saveChanges();
        waitSeconds(2);
        Assert.assertEquals(settingsSecurityPage.passwordChanged(),"Password changed");
        settingsSecurityPage.stayLoggedIn();
        settingsSecurityPage.continueChangePass();
        waitSeconds(2);
        // return to original pass
        settingsSecurityPage.passwordEditButton();
        Assert.assertEquals(settingsSecurityPage.getTextOldPassword(),"Current");
        settingsSecurityPage.oldPassword(newPass);
        Assert.assertEquals(settingsSecurityPage.getTextNewPassword(),"New");
        settingsSecurityPage.newPassword(password);
        Assert.assertEquals(settingsSecurityPage.getTextConfirmPassword(),"Re-type new");
        settingsSecurityPage.confirmPassword(password);
        settingsSecurityPage.saveChanges();
        waitSeconds(2);
        Assert.assertEquals(settingsSecurityPage.passwordChanged(),"Password changed");
        settingsSecurityPage.stayLoggedIn();
        settingsSecurityPage.continueChangePass();

    }
    @Test
    public void FBTesting_009() {
        String weakPass = "88888888";
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        settingsSecurityPage.securityAndLogin();
        waitSeconds(2);
        switchToIFrame(settingsGeneralPage.iFrame);
        settingsSecurityPage.passwordEditButton();
        Assert.assertEquals(settingsSecurityPage.getTextOldPassword(),"Current");
        settingsSecurityPage.oldPassword(password);
        Assert.assertEquals(settingsSecurityPage.getTextNewPassword(),"New");
        settingsSecurityPage.newPassword(weakPass);
        Assert.assertEquals(settingsSecurityPage.getTextConfirmPassword(),"Re-type new");
        settingsSecurityPage.confirmPassword(weakPass);
        settingsSecurityPage.saveChanges();
        waitSeconds(2);
        Assert.assertEquals(settingsSecurityPage.iconTextPass(),"Please choose a more secure password.");

    }
    @Test
    public void FBTesting_010() {
        loginPage.clickOnDropDownButtinByProfile();
        settingsSecurityPage.settingsAndPrivacy();
        settingsSecurityPage.settings();
        settingsSecurityPage.securityAndLogin();
        waitSeconds(2);
        switchToIFrame(settingsGeneralPage.iFrame);
        settingsSecurityPage.passwordEditButton();
        Assert.assertEquals(settingsSecurityPage.getTextOldPassword(),"Current");
        settingsSecurityPage.oldPassword(password);
        Assert.assertEquals(settingsSecurityPage.getTextNewPassword(),"New");
        settingsSecurityPage.newPassword(password);
        Assert.assertEquals(settingsSecurityPage.getTextConfirmPassword(),"Re-type new");
        settingsSecurityPage.confirmPassword(password);
        settingsSecurityPage.saveChanges();
        waitSeconds(2);
        Assert.assertEquals(settingsSecurityPage.iconTextPass(),"Password must differ from old password.");
    }

}
