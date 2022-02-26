package Team4Pro;

import base.OurAPI;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.omg.CORBA.MARSHAL;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;

public class UploadPhoto extends OurAPI {
    LoginPage loginPage;
    MainProfilePage mainProfilePage;
    PhotosPage photosPage;
    String email = "testFaceBookEmail111@gmail.com";
    String password = "12345abc!";

    @BeforeMethod
    public void librarySetUp() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainProfilePage = PageFactory.initElements(driver, MainProfilePage.class);
        photosPage = PageFactory.initElements(driver, PhotosPage.class);
        loginPage.emailFeed(email);
        loginPage.passwordFeed(password);
        loginPage.clickOnLogIn();
    }
    @AfterMethod
    public void libraryDelete() {
        System.gc();
    }

    @Test
    public void photoUpload25() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickAddCoverPhoto();
        mainProfilePage.clickUploadPhoto();
        waitSeconds(1);
        mainProfilePage.inputFileNameForCoverPhoto();
        Assert.assertEquals(mainProfilePage.getTextPhotoIsUploaded(),"Your cover photo is public.");
        waitSeconds(1);
        mainProfilePage.clickSaveCoverPhoto();
        //waitSeconds(2000);
    }
    @Test
    public void photoUpload26() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickEditCoverPhoto();
        mainProfilePage.clickUploadPhoto();
        waitSeconds(1);
        mainProfilePage.inputFileNameForCoverPhoto2();
        Assert.assertEquals(mainProfilePage.getTextPhotoIsUploaded(),"Your cover photo is public.");
        mainProfilePage.clickSaveCoverPhoto();
    }
    @Test
    public void photoUpload27() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickEditCoverPhoto();
        mainProfilePage.clickOnRemovePhoto();
        mainProfilePage.clickOnConfirmButton();
    }
    @Test
    public void photoUpload28() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickAddCoverPhoto();
        mainProfilePage.clickOnSelectCoverPhoto();
        waitSeconds(1);
        mainProfilePage.clickOnPhotoInSelectMode();
        Assert.assertEquals(mainProfilePage.getTextPhotoIsUploaded(),"Your cover photo is public.");
        mainProfilePage.clickSaveCoverPhoto();
    }
    @Test
    public void photoUpload29() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        scroller("-500");
        mainProfilePage.clickAddCoverPhoto();
        mainProfilePage.clickUploadPhoto();
        waitSeconds(1);
        mainProfilePage.inputFileNameForCoverPhoto();
        waitSeconds(3);
        scroller("-300");
        //waitSeconds(2);
        //mainProfilePage.clickOnImageToDrag();
        mainProfilePage.moveMouse(900,400);
        mainProfilePage.clickAndHold(InputEvent.BUTTON1_MASK);
        waitSeconds(1);
        mainProfilePage.moveMouse(1200,400);
        waitSeconds(2);
        mainProfilePage.moveMouse(600,400);
        waitSeconds(2);
        mainProfilePage.releaseButton(InputEvent.BUTTON1_MASK);
        mainProfilePage.clickOnCancelCoverPhoto();
        mainProfilePage.clickAddCoverPhoto();
        mainProfilePage.clickUploadPhoto();
        waitSeconds(1);
        mainProfilePage.inputFileNameForCoverPhoto2();
        waitSeconds(3);
        scroller("-300");
        mainProfilePage.moveMouse(900,400);
        mainProfilePage.clickAndHold(InputEvent.BUTTON1_MASK);
        waitSeconds(1);
        mainProfilePage.moveMouse(900,350);
        waitSeconds(2);
        mainProfilePage.moveMouse(900,450);
        waitSeconds(2);
        mainProfilePage.releaseButton(InputEvent.BUTTON1_MASK);

    }
    @Test
    public void profilePhoto30() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickOnProfilePicture();
        mainProfilePage.clickOnAddProfilePhoto();
        waitSeconds(1);
        Assert.assertEquals(mainProfilePage.getTextUpdateProfilePicture(),"Update profile picture");
        mainProfilePage.clickOnUploadPhotoForProfile();
        waitSeconds(2);
        mainProfilePage.inputFileNameForCoverPhoto2();
        mainProfilePage.insertTextForDescription();
        mainProfilePage.drageToCircle();
        waitSeconds(3);
        mainProfilePage.clickAndHold(InputEvent.BUTTON1_MASK);
        mainProfilePage.smoothCircleMove();
        mainProfilePage.smoothCircleMoveBack();
        mainProfilePage.releaseButton(InputEvent.BUTTON1_MASK);
        mainProfilePage.clickOnMakeTemporary();
        scroller("300");
        Assert.assertEquals(mainProfilePage.getTextSwitchBackToPreviousImage(),"Switch back to previous profile picture in");
        mainProfilePage.clickDropDownTemporary();
        mainProfilePage.clickOnOneHour();
        mainProfilePage.clickSaveButtonProfilePicture();
        waitSeconds(1);
    }
    @Test
    public void profilePhoto31() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickOnProfilePicture();
        mainProfilePage.clickOnViewProfilePicture();
        waitSeconds(1);
        Assert.assertEquals(mainProfilePage.getTextDescriptionHolder(),"This is description");
        mainProfilePage.clickOnEditButtonInProfilePicture();
        mainProfilePage.cleanTheDescriptionField();
        waitSeconds(1);
        mainProfilePage.insertTextToDescriptionFieldInProfilePicture();
        mainProfilePage.clickOnSmileGallery();
        mainProfilePage.clickOnFaceWithStarGlasses();
        waitSeconds(1);
        mainProfilePage.clickOnSmileGallery();
        mainProfilePage.clickOnDoneEditingProfile();
        waitSeconds(2);
        Assert.assertEquals(mainProfilePage.getTextDescriptionHolder(),"I am machine");
        mainProfilePage.clickOnCloseEditWindow();
    }
    @Test
    public void profilePhoto34() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickOnProfilePicture();
        Assert.assertEquals(mainProfilePage.getTextUpdateProfilePictureWhnePicIsSet(),"Update profile picture");
        mainProfilePage.clickUpdateProfilePictureWhenPicIsSet();
        waitSeconds(1);
        Assert.assertEquals(mainProfilePage.getTextUpdateProfilePicture(),"Update profile picture");
        mainProfilePage.clickOnUploadPhotoForProfile();
        waitSeconds(2);
        mainProfilePage.inputFileNameForCoverPhoto();
        mainProfilePage.insertTextForDescription();
        mainProfilePage.drageToCircle();
        waitSeconds(3);
        mainProfilePage.clickAndHold(InputEvent.BUTTON1_MASK);
        mainProfilePage.smoothCircleMove();
        mainProfilePage.smoothCircleMoveBack();
        mainProfilePage.releaseButton(InputEvent.BUTTON1_MASK);
        mainProfilePage.clickOnMakeTemporary();
        scroller("300");
        Assert.assertEquals(mainProfilePage.getTextSwitchBackToPreviousImage(),"Switch back to previous profile picture in");
        mainProfilePage.clickDropDownTemporary();
        mainProfilePage.clickOnOneHour();
        mainProfilePage.clickSaveButtonProfilePicture();
        waitSeconds(8);
        mainProfilePage.clickOnProfilePicture();
        Assert.assertEquals(mainProfilePage.getTextUpdateProfilePictureWhnePicIsSet(),"Update profile picture");
        mainProfilePage.clickUpdateProfilePictureWhenPicIsSet();
        waitSeconds(1);
        Assert.assertEquals(mainProfilePage.getTextUploadsInProfile(),"Uploads");
        mainProfilePage.clickOnFirstUploadPicture();
        mainProfilePage.clickSaveButtonProfilePicture();
        waitSeconds(1);

    }
    @Test
    public void profilePhoto32() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickOnProfilePicture();
        Assert.assertEquals(mainProfilePage.getTextUpdateProfilePictureWhnePicIsSet(),"Update profile picture");
        mainProfilePage.clickOnChangeTimeProfilePicture();
        waitSeconds(1);
        Assert.assertEquals(mainProfilePage.getTextChangeEndTime(),"Change End Time");
        Assert.assertEquals(mainProfilePage.getTextDateProfilePicture(),"Date");
        mainProfilePage.clickOnDateBox();
        mainProfilePage.clickOnMarch5th();
        Assert.assertEquals(mainProfilePage.getTextFromDateBox(),"Mar 5, 2022");
        mainProfilePage.cleanDateField();
        mainProfilePage.insertDateInDateBox("03/07/2022");
        Assert.assertEquals(mainProfilePage.getTextFromDateBox(),"Mar 7, 2022");
        mainProfilePage.cleanDateField();
        mainProfilePage.insertDateInDateBox("april 7 2022");
        Assert.assertEquals(mainProfilePage.getTextFromDateBox(),"Apr 7, 2022");
        Assert.assertEquals(mainProfilePage.getTextTimeProfilePicture(),"Time");
        mainProfilePage.clickOnTimeBox();
        mainProfilePage.clickOnTimeOption();
        mainProfilePage.cleanTimeField();
        mainProfilePage.insertTimeInTimeBox("18:00am");
        Assert.assertEquals(mainProfilePage.getTextFromTimeBox(),"6:00 PM");
        mainProfilePage.cleanTimeField();
        mainProfilePage.insertTimeInTimeBox("3:00pm");
        Assert.assertEquals(mainProfilePage.getTextFromTimeBox(),"3:00 PM");
        mainProfilePage.clickOnSaveChanges();
    }
    @Test
    public void profilePhoto33() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickOnProfilePicture();
        Assert.assertEquals(mainProfilePage.getTextSwitchToPreviousNow(),"Switch to previous picture now");
        mainProfilePage.clickOnSwitchToPreviousPicture();
        Assert.assertEquals(mainProfilePage.getTextSwitchToPrevPicture(),"Switch to Previous Picture?");
        mainProfilePage.clickOnConfirmSwitch();
    }
    @Test
    public void profilePhoto35() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickOnPhotosInProfileTab();
        photosPage.clickOnEditButtonFirstPhoto();
        //waitSeconds(1000);
        Assert.assertEquals(photosPage.getTextMakeProfilePicture(),"Make Profile Picture");
        photosPage.clickOnMakeProfilePicture();
        mainProfilePage.insertTextForDescription();
        scroller("300");
        mainProfilePage.clickOnMakeTemporary();
        Assert.assertEquals(mainProfilePage.getTextSwitchBackToPreviousImage(),"Switch back to previous profile picture in");
        //waitSeconds(1000);
        mainProfilePage.clickDropDownTemporary();
        mainProfilePage.clickOnOneHour();
        mainProfilePage.clickSaveButtonProfilePicture();
        waitSeconds(8);
        photosPage.clickOmEditButtonSecondPhoto();
        Assert.assertEquals(photosPage.getTextMakeCoverPhoto(),"Make Cover Photo");
        photosPage.clickOnMakeCoverPhoto();
        photosPage.clickOnSaveButton();
    }
    @Test
    public void profilePhoto36() {
        mainProfilePage.clickOnMyProfileButton();
        Assert.assertEquals(mainProfilePage.getTextMyName(),"Leonid Leonid");
        mainProfilePage.clickOnPhotosInProfileTab();
        photosPage.clickOnEditButtonFirstPhoto();
        photosPage.clickDeletePhoto();
        photosPage.clickOnDeleteConfirmButton();
        waitSeconds(5);
        Assert.assertEquals(photosPage.getTextYourPhotoHasBeenDeleted(),"Your photo has been deleted");
        photosPage.clickOmEditButtonSecondPhoto();
        photosPage.clickDeletePhoto();
        photosPage.clickOnDeleteConfirmButton();
        waitSeconds(5);
        Assert.assertEquals(photosPage.getTextYourPhotoHasBeenDeleted(),"Your photo has been deleted");
    }



    public static void main(String[] args) {
        try {
            Robot r = new Robot();
            r.mouseMove(0,0);
            r.mouseMove(572,736);
            Thread.sleep(1000);
            r.mouseMove(200,600);
        } catch (Exception e) {

        }
    }
}
