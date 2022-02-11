package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfileSettings extends OurAPI {
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
    public void FBTesting_011() {
        String firtsName = "Leoa";
        String middleName = "Leob";
        String lastName = "Leoc";
        webElementsLibrary.clickOnDropDownButtinByProfile();
        webElementsLibrary.settingsAndPrivacy_FBTesting_008();
        webElementsLibrary.settings_FBTesting_008();
        switchToIFrame(webElementsLibrary.iFrame);
        waitSeconds(1);
        Assert.assertEquals(webElementsLibrary.getTextGeneral_FBTesting_011(),"General Account Settings");
        webElementsLibrary.clickOnEdit_FBTesting_011();
        waitSeconds(2);
        Assert.assertEquals(webElementsLibrary.getTextFirstName_FBTesting_011(),"First");
        webElementsLibrary.nameField.clear();
        feedDataWithNoClick(webElementsLibrary.nameField,firtsName);
        Assert.assertEquals(webElementsLibrary.getTextLastName_FBTesting_011(),"Last");
        webElementsLibrary.lastNameField.clear();
        feedDataWithNoClick(webElementsLibrary.lastNameField,lastName);
        Assert.assertEquals(webElementsLibrary.getTextMiddleName_FBTesting_011(),"Middle");
        webElementsLibrary.middleNameField.clear();
        feedDataWithNoClick(webElementsLibrary.middleNameField,middleName);
        webElementsLibrary.clickOnReview_FBTesting_011();
        waitSeconds(2);
        Assert.assertEquals(webElementsLibrary.getPassText_FBTesting_011(),"Password");
        webElementsLibrary.insertPass_FBTesting_011(password);
        webElementsLibrary.cancelClick_FBTesting_011();
    }
}
