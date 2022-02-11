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
    WebElementsLibrary webElementsLibrary;
    @BeforeMethod
    public void librarySetUp() {
        webElementsLibrary = PageFactory.initElements(driver,WebElementsLibrary.class);
        webElementsLibrary.emailFeed(email);
        webElementsLibrary.passwordFeed(password);
        webElementsLibrary.clickOnLogIn();
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void FBTest_008() {
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.settingsAndPrivacy_FBTesting_008();
        webElementsLibrary.settings_FBTesting_008();
        webElementsLibrary.securityAndLogin_FBTesting_008();
        waitSeconds(2);
        switchToIFrame(webElementsLibrary.iFrame);
        Assert.assertEquals(webElementsLibrary.getTextSecurityAndLogin_FBTesting_008(),"Security and Login");
        webElementsLibrary.passwordEditButton_FBTesting_008();
        Assert.assertEquals(webElementsLibrary.getTextOldPassword_FBTesting_008(),"Current");
        webElementsLibrary.oldPassword_FBTesting_08(password);
        Assert.assertEquals(webElementsLibrary.getTextNewPassword_FBTesting_008(),"New");
        webElementsLibrary.newPassword_FBTesting_08(newPass);
        Assert.assertEquals(webElementsLibrary.getTextConfirmPassword_FBTesting_008(),"Re-type new");
        webElementsLibrary.confirmPassword_FBTesting_008(newPass);
        webElementsLibrary.saveChanges_FBTesting_008();
        waitSeconds(2);
        Assert.assertEquals(webElementsLibrary.passwordChanged_FBTesting_008(),"Password changed");
        webElementsLibrary.stayLoggedIn_FBTesting_008();
        webElementsLibrary.continueChangePass_FBTesting_008();
        waitSeconds(2);
        // return to original pass
        webElementsLibrary.passwordEditButton_FBTesting_008();
        Assert.assertEquals(webElementsLibrary.getTextOldPassword_FBTesting_008(),"Current");
        webElementsLibrary.oldPassword_FBTesting_08(newPass);
        Assert.assertEquals(webElementsLibrary.getTextNewPassword_FBTesting_008(),"New");
        webElementsLibrary.newPassword_FBTesting_08(password);
        Assert.assertEquals(webElementsLibrary.getTextConfirmPassword_FBTesting_008(),"Re-type new");
        webElementsLibrary.confirmPassword_FBTesting_008(password);
        webElementsLibrary.saveChanges_FBTesting_008();
        waitSeconds(2);
        Assert.assertEquals(webElementsLibrary.passwordChanged_FBTesting_008(),"Password changed");
        webElementsLibrary.stayLoggedIn_FBTesting_008();
        webElementsLibrary.continueChangePass_FBTesting_008();

    }
    @Test
    public void FBTesting_009() {
        String weakPass = "88888888";
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.settingsAndPrivacy_FBTesting_008();
        webElementsLibrary.settings_FBTesting_008();
        webElementsLibrary.securityAndLogin_FBTesting_008();
        waitSeconds(2);
        switchToIFrame(webElementsLibrary.iFrame);
        webElementsLibrary.passwordEditButton_FBTesting_008();
        Assert.assertEquals(webElementsLibrary.getTextOldPassword_FBTesting_008(),"Current");
        webElementsLibrary.oldPassword_FBTesting_08(password);
        Assert.assertEquals(webElementsLibrary.getTextNewPassword_FBTesting_008(),"New");
        webElementsLibrary.newPassword_FBTesting_08(weakPass);
        Assert.assertEquals(webElementsLibrary.getTextConfirmPassword_FBTesting_008(),"Re-type new");
        webElementsLibrary.confirmPassword_FBTesting_008(weakPass);
        webElementsLibrary.saveChanges_FBTesting_008();
        waitSeconds(2);
        Assert.assertEquals(webElementsLibrary.iconTextPass_FBTesting_009(),"Please choose a more secure password.");

    }
    @Test
    public void FBTesting_010() {
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.settingsAndPrivacy_FBTesting_008();
        webElementsLibrary.settings_FBTesting_008();
        webElementsLibrary.securityAndLogin_FBTesting_008();
        waitSeconds(2);
        switchToIFrame(webElementsLibrary.iFrame);
        webElementsLibrary.passwordEditButton_FBTesting_008();
        Assert.assertEquals(webElementsLibrary.getTextOldPassword_FBTesting_008(),"Current");
        webElementsLibrary.oldPassword_FBTesting_08(password);
        Assert.assertEquals(webElementsLibrary.getTextNewPassword_FBTesting_008(),"New");
        webElementsLibrary.newPassword_FBTesting_08(password);
        Assert.assertEquals(webElementsLibrary.getTextConfirmPassword_FBTesting_008(),"Re-type new");
        webElementsLibrary.confirmPassword_FBTesting_008(password);
        webElementsLibrary.saveChanges_FBTesting_008();
        waitSeconds(2);
        Assert.assertEquals(webElementsLibrary.iconTextPass_FBTesting_009(),"Password must differ from old password.");
    }

}
