package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;


public class MainProfilePage extends OurAPI {
    @FindBy(xpath = "//h1[contains(text(),'Leonid Leonid')]")
    WebElement myName;
    @FindBy(xpath = "//a[@href=\"/me/\"]")
    WebElement myProfileButton;
    @FindBy(xpath = "//div[@aria-label=\"Add Cover Photo\"]/div")
    WebElement addCoverPhoto;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1\"]/div/div/div/div[2]")
    WebElement uploadPhoto;
    @FindBy(xpath = "//span[contains(text(),'Your cover photo is public.')]")
    WebElement photoIsUploadedText;
    @FindBy(xpath = "//div[@class=\"d6rk862h n7fi1qx3 pmk7jnqg j9ispegn kr520xx4 tkr6xdv7\"]/div[1]/div[2]/div[1]/div[1]")
    WebElement saveCoverPhoto;
    @FindBy(xpath = "//div[@aria-label=\"Edit cover photo\"]")
    WebElement editCoverPhoto;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1\"]/div/div/div/div[5]")
    WebElement removePhoto;
    @FindBy(xpath = "//div[@aria-label=\"Remove Cover Photo\"]/div[4]/div/div[1]/div[1]/div")
    WebElement confirmButton;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1\"]/div/div/div/div[1]")
    WebElement selectCoverPhoto;
    @FindBy(xpath = "//div[@aria-label=\"Select Photo\"]/div/div/div[3]/div[2]/div/div[1]/div/div/div")
    WebElement photoToBeSelected;
    @FindBy(xpath = "//img[@data-imgperflogname=\"profileCoverPhoto\"]")
    WebElement imageToDrag;
    @FindBy(xpath = "//div[@class=\"d6rk862h n7fi1qx3 pmk7jnqg j9ispegn kr520xx4 tkr6xdv7\"]/div[1]/div[2]/div[2]/div[2]")
    WebElement cancelCoverPhoto;
    @FindBy(xpath = "//div[@aria-label=\"Profile picture actions\"]")
    WebElement profilePictureArea;
    @FindBy(xpath = "//div[@class=\"gs1a9yip fj0cixhj j83agx80 cbu4d94t l9j0dhe7 dd2scrzq ejg0drik\"]/div/div")
    WebElement addProfilePhoto;
    @FindBy(xpath = "//span[contains(text(),'Update profile picture')]")
    WebElement updateProfilePictureText;
    @FindBy(xpath = "//div[@aria-label=\"Upload Photo\"]")
    WebElement uploadPhotoButtonForProfile;
    @FindBy(xpath = "//label[@aria-label=\"Description\"]/div/div/textarea")
    WebElement descriptionArea;
    @FindBy(xpath = "//div[@class=\"ke6wolob rk01pc8j l9j0dhe7 f9o22wc5 ad2k81qe\"]")
    WebElement picureToBeEdited;
    @FindBy(xpath = "//div[@aria-label=\"Zoom\"]")
    WebElement zoomCircle;
    @FindBy(xpath = "//div[@aria-label=\"Make Temporary\"]")
    WebElement makeTemporary;
    @FindBy(xpath = "//span[contains(text(),'Switch back to previous profile picture in')]")
    WebElement switchBackToPreviousImageText;
    @FindBy(xpath = "//div[@aria-haspopup=\"listbox\"]")
    WebElement dropDownTemporary;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1\"]/div/div[1]/div/div[1]")
    WebElement oneHourPicture;
    @FindBy(xpath = "//div[@aria-label=\"Save\"]")
    WebElement saveButtonProfilePicture;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1\"]/div/div/div/a")
    WebElement viewProfilePicture;
    @FindBy(xpath = "//div[@class=\"dati1w0a f10w8fjw hv4rvrfc discj3wi\"]/div/div[2]/span")
    WebElement descriptionHolder;
    @FindBy(xpath = "//div[@aria-label=\"Edit\"]")
    WebElement editButtonInProfilePicture;
    @FindBy(xpath = "//div[@aria-label=\"Add a description\"]")
    WebElement addDescriptionFieldInProfilePicture;
    @FindBy(xpath = "//div[@class=\"b3onmgus pby63qed ph5uu5jm ecm0bbzt\"]/i")
    WebElement smileButtonProfilePicture;
    @FindBy(xpath = "//img[@alt=\"\uD83E\uDD29\"]")
    WebElement faceWithStarGlasses;
    @FindBy(xpath = "//div[@aria-label=\"Done Editing\"]")
    WebElement doneEditingProfilePicture;
    @FindBy(xpath = "//div[@aria-label=\"Close\"]/i")
    WebElement closeEditPictureWindow;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1\"]/div/div/div/div[1]")
    WebElement updateProfilePictureWhenPictureIsSet;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr dd2scrzq srfxjet1\"]/div/div/div/div[1]/div/div/div/span")
    WebElement updateProfilePictureWhenPicIsSetText;
    @FindBy(xpath = "//div[@class=\"a1zevxcz j83agx80\"]/div/div/div/div[2]/div/div/span")
    WebElement uploadsTextProfilePicture;
    @FindBy(xpath = "//div[@class=\"a1zevxcz j83agx80\"]/div/div/div/div[2]/div/div[2]/div[1]/div")
    WebElement firstElementINnUploads;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 swg4t2nn\"]/div/div/div/div/div/div/div[3]")
    WebElement changeEndTimeProfilePicture;
    @FindBy(xpath = "//span[contains(text(),'Change End Time')]")
    WebElement changeEndTimeText;
    @FindBy(xpath = "//span[contains(text(),'Date')]")
    WebElement dateTextProfilePicture;
    @FindBy(xpath = "//label[@aria-label=\"Choose Date\"]/div/div[2]/div/input")
    WebElement dateBoxProfilePic;
    @FindBy(xpath = "//div[@class=\"lzcic4wl cbu4d94t j83agx80\"]/div[6]/div[7]")
    WebElement march5thInCalendar;
    @FindBy(xpath = "//label[@aria-label=\"Time\"]/div/div/span")
    WebElement timeTextProfilePic;
    @FindBy(xpath = "//label[@aria-label=\"Time\"]/div/div/div/input")
    WebElement timeBoxProfilePic;
    @FindBy(xpath = "//div[@role=\"listbox\"]/div/div/div/div/div/div/div[70]")
    WebElement timeInDropDown;
    @FindBy(xpath = "//div[@aria-label=\"Change End Time\"]/div[3]/div[2]/div/div[1]")
    WebElement confirmChangeTime;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div/div/div[4]/div/i")
    WebElement switchToPreviousPicture;
    @FindBy(xpath = "//span[contains(text(),'Switch to previous picture now')]")
    WebElement switchToPreviousNowText;
    @FindBy(xpath = "//div[@aria-label=\"Switch to Previous Picture?\"]/div[4]/div/div[1]/div[1]")
    WebElement confirmSwitchToPrevious;
    @FindBy(xpath = "//span[contains(text(),'Switch to Previous Picture?')]")
    WebElement confirmSwitchToPreviousText;
    @FindBy(xpath = "//div[@data-pagelet=\"ProfileTabs\"]/div/div/div/div/a[4]")
    WebElement photosProfileTab;
    @FindBy(xpath = "//span[contains(text(),'Intro')]")
    WebElement introText;
    @FindBy(xpath = "//div[@aria-label=\"Add Bio\"]")
    WebElement addBioButton;
    @FindBy(xpath = "//span[contains(text(),\"Add Bio\")]")
    WebElement addBioText;
    @FindBy(xpath = "//textarea[@placeholder=\"Describe who you are\"]")
    WebElement bioTextBox;
    @FindBy(xpath = "//div[@aria-label=\"Save\"]")
    WebElement saveBioButton;
    @FindBy(xpath = "//div[@data-pagelet=\"ProfileTilesFeed_0\"]/div/div/div/div/div[2]/div[1]/div/div/span")
    WebElement yourSavedBioText;
    @FindBy(xpath = "//div[@class=\"oqcyycmt\"]")
    WebElement possibleClassForBioTextHolder;
    @FindBy(xpath = "//div[@aria-label=\"Edit bio\"]")
    WebElement editBioButton;
    @FindBy(xpath = "//div[@aria-label=\"Edit bio\"]/div/div/div/span/span")
    WebElement editBioText;
    @FindBy(xpath = "//div[@data-pagelet=\"ProfileTilesFeed_0\"]/div/div/div/div/div[2]/div[1]/div/div/div/span")
    WebElement howManyCharsRemaining;
    @FindBy(xpath = "//div[@aria-label=\"Edit details\"]")
    WebElement editDetailsButton;




    public String getTextMyName() {
        return myName.getText();
    }
    public void clickOnMyProfileButton() {
        click(myProfileButton);
    }
    public void clickAddCoverPhoto() {
        click(addCoverPhoto);
    }
    public void clickUploadPhoto() {
        click(uploadPhoto);
    }
    public void inputFileNameForCoverPhoto() {
        try {
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_I);
            r.keyRelease(KeyEvent.VK_I);
            r.keyPress(KeyEvent.VK_M);
            r.keyRelease(KeyEvent.VK_M);
            r.keyPress(KeyEvent.VK_A);
            r.keyRelease(KeyEvent.VK_A);
            r.keyPress(KeyEvent.VK_G);
            r.keyRelease(KeyEvent.VK_G);
            r.keyPress(KeyEvent.VK_E);
            r.keyRelease(KeyEvent.VK_E);
            r.keyPress(KeyEvent.VK_2);
            r.keyRelease(KeyEvent.VK_2);
            r.keyPress(KeyEvent.VK_PERIOD);
            r.keyRelease(KeyEvent.VK_PERIOD);
            r.keyPress(KeyEvent.VK_J);
            r.keyRelease(KeyEvent.VK_J);
            r.keyPress(KeyEvent.VK_P);
            r.keyRelease(KeyEvent.VK_P);
            r.keyPress(KeyEvent.VK_G);
            r.keyRelease(KeyEvent.VK_G);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e){

        }

    }
    public String getTextPhotoIsUploaded() {
        return photoIsUploadedText.getText();
    }
    public void clickSaveCoverPhoto() {
        click(saveCoverPhoto);
    }
    public void clickEditCoverPhoto() {
        click(editCoverPhoto);
    }
    public void inputFileNameForCoverPhoto2() {
        try {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);
        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_G);
        r.keyRelease(KeyEvent.VK_G);
        r.keyPress(KeyEvent.VK_E);
        r.keyRelease(KeyEvent.VK_E);
        r.keyPress(KeyEvent.VK_1);
        r.keyRelease(KeyEvent.VK_1);
        r.keyPress(KeyEvent.VK_PERIOD);
        r.keyRelease(KeyEvent.VK_PERIOD);
        r.keyPress(KeyEvent.VK_J);
        r.keyRelease(KeyEvent.VK_J);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        r.keyPress(KeyEvent.VK_G);
        r.keyRelease(KeyEvent.VK_G);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    } catch (Exception e){
        }
    }
    public void clickOnRemovePhoto() {
        click(removePhoto);
    }
    public void clickOnConfirmButton() {
        click(confirmButton);
    }
    public void clickOnSelectCoverPhoto() {
        click(selectCoverPhoto);
    }
    public void clickOnPhotoInSelectMode() {
        click(photoToBeSelected);
    }
    public void moveMouse(int x, int y) {
        try {
            Robot r = new Robot();
            r.mouseMove(x,y);
        } catch (Exception e) {

        }
    }
    public void clickAndHold(int mask) {
        try {
            Robot r = new Robot();
            r.mousePress(mask);
        } catch (Exception e) {

        }
    }
    public void releaseButton(int mask) {
        try {
            Robot r = new Robot();
            r.mouseRelease(mask);
        } catch (Exception e) {

        }
    }
    public void clickOnImageToDrag() {
        click(imageToDrag);
    }
    public void clickOnCancelCoverPhoto() {
        click(cancelCoverPhoto);
    }
    public void clickOnProfilePicture() {
        click(profilePictureArea);
    }
    public void clickOnAddProfilePhoto() {
        click(addProfilePhoto);
    }
    public String getTextUpdateProfilePicture() {
        return updateProfilePictureText.getText();
    }
    public void clickOnUploadPhotoForProfile() {
        click(uploadPhotoButtonForProfile);
    }
    public void insertTextForDescription() {
        feedDataWithNoClick(descriptionArea,"This is description");
    }
    public void drageToCircle() {
        try {
            Robot r = new Robot();
            r.mouseMove(-60000,-60000);
            r.mouseMove(566,785);
        } catch (Exception e) {

        }
    }
    public void smoothCircleMove() {
        try {
            Robot r = new Robot();
            for (int i = 566; i<=966; i+=4) {
                r.mouseMove(-60000, -60000);
                r.mouseMove(i, 785);
                Thread.sleep(20);
            }
        } catch (Exception e) {

        }
    }
    public void smoothCircleMoveBack() {
        try {
            Robot r = new Robot();
            for (int i = 966; i>566; i-=4) {
                r.mouseMove(-60000, -60000);
                r.mouseMove(i, 785);
                Thread.sleep(20);
            }
        } catch (Exception e) {

        }
    }
    public void clickOnMakeTemporary() {
        click(makeTemporary);
    }
    public String getTextSwitchBackToPreviousImage() {
        return switchBackToPreviousImageText.getText();
    }
    public void clickDropDownTemporary() {
        click(dropDownTemporary);
    }
    public void clickSaveButtonProfilePicture() {
        click(saveButtonProfilePicture);
    }
    public void clickOnOneHour() {
        click(oneHourPicture);
    }
    public void clickOnViewProfilePicture() {
        click(viewProfilePicture);
    }
    public String getTextDescriptionHolder() {
        return descriptionHolder.getText();
    }
    public void clickOnEditButtonInProfilePicture() {
        click(editButtonInProfilePicture);
    }
    public void cleanTheDescriptionField() {
        addDescriptionFieldInProfilePicture.sendKeys(Keys.CONTROL + "a");
        addDescriptionFieldInProfilePicture.sendKeys(Keys.DELETE);
    }
    public void insertTextToDescriptionFieldInProfilePicture() {
        feedDataWithNoClick(addDescriptionFieldInProfilePicture,"I am machine");

    }
    public void clickOnSmileGallery() {
        click(smileButtonProfilePicture);
    }
    public void clickOnFaceWithStarGlasses() {
        click(faceWithStarGlasses);
    }
    public void clickOnDoneEditingProfile() {
        click(doneEditingProfilePicture);
    }
    public void clickOnCloseEditWindow() {
        click(closeEditPictureWindow);
    }
    public void clickUpdateProfilePictureWhenPicIsSet() {
        click(updateProfilePictureWhenPictureIsSet);
    }
    public String getTextUpdateProfilePictureWhnePicIsSet() {
        return updateProfilePictureWhenPicIsSetText.getText();
    }
    public String getTextUploadsInProfile() {
        return uploadsTextProfilePicture.getText();
    }
    public void clickOnFirstUploadPicture() {
        click(firstElementINnUploads);
    }
    public void clickOnChangeTimeProfilePicture() {
        click(changeEndTimeProfilePicture);
    }
    public String getTextChangeEndTime() {
        return changeEndTimeText.getText();
    }
    public String getTextDateProfilePicture() {
        return dateTextProfilePicture.getText();
    }
    public void insertDateInDateBox(String date){
        enterText(dateBoxProfilePic,date);
    }
    public void clickOnDateBox() {
        click(dateBoxProfilePic);
    }
    public void clickOnMarch5th() {
        click(march5thInCalendar);
    }
    public String getTextFromDateBox() {
        return dateBoxProfilePic.getAttribute("value");
    }
    public String getTextTimeProfilePicture() {
        return timeTextProfilePic.getText();
    }
    public void clickOnTimeBox() {
        click(timeBoxProfilePic);
    }
    public void clickOnTimeOption() {
        click(timeInDropDown);
    }
    public String  getTextFromTimeBox() {
        return timeBoxProfilePic.getAttribute("value");
    }
    public void insertTimeInTimeBox(String time) {
        enterText(timeBoxProfilePic,time);
    }
    public void clickOnSaveChanges() {
        click(confirmChangeTime);
    }
    public void cleanDateField() {
        click(dateBoxProfilePic);
        dateBoxProfilePic.sendKeys(Keys.CONTROL + "a");
        dateBoxProfilePic.sendKeys(Keys.DELETE);
    }
    public void cleanTimeField() {
        click(timeBoxProfilePic);
        timeBoxProfilePic.sendKeys(Keys.CONTROL + "a");
        timeBoxProfilePic.sendKeys(Keys.DELETE);
    }
    public void clickOnSwitchToPreviousPicture() {
        click(switchToPreviousPicture);
    }
    public String getTextSwitchToPreviousNow() {
        return switchToPreviousNowText.getText();
    }
    public void clickOnConfirmSwitch() {
        click(confirmSwitchToPrevious);
    }
    public String getTextSwitchToPrevPicture() {
        return confirmSwitchToPreviousText.getText();
    }
    public void clickOnPhotosInProfileTab() {
        click(photosProfileTab);
    }
    public void clickOnAddBio() {
        click(addBioButton);
    }
    public String getTextIntro() {
        return introText.getText();
    }
    public String getTextAddBio() {
        return addBioText.getText();
    }
    public String getTextDescribeYourself() {
        return bioTextBox.getAttribute("placeholder");
    }
    public void insertDateInBioTextBox() {
        feedDataWithNoClick(bioTextBox,"I am robot, but i feel like human");
    }
    public void clickOnSaveBio() {
        click(saveBioButton);
    }
    public String getTextYourSavedBio() {
        return yourSavedBioText.getText();
    }
    public void clickOnEditButton() {
        click(editBioButton);
    }
    public String getTextEditBio() {
        return editBioText.getText();
    }
    public void cleanBioTextField() {
        bioTextBox.sendKeys(Keys.CONTROL + "a");
        bioTextBox.sendKeys(Keys.DELETE);
    }
    public void insertDataToBioToTestBoundaries() {
        feedDataWithNoClick(bioTextBox,"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");

    }
    public String getTextHowManyCharsRemaining() {
        return howManyCharsRemaining.getText();
    }
    public String getTextSaveButtonIsDisabled() {
        return saveBioButton.getAttribute("aria-disabled");
    }
    public void clickOnEditDetailsButton() {
        click(editDetailsButton);
    }


}
