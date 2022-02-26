package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotosPage extends OurAPI {
    @FindBy(xpath = "//div[@class=\"bi6gxh9e\"]/div/div[1]/div/div/a/div[2]/div")
    WebElement editButtonFirstPhoto;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div/div/div[4]")
    WebElement makeProfilePicture;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div/div/div[4]/div[2]/div/div/span")
    WebElement makeProfilePictureText;
    @FindBy(xpath = "//div[@class=\"bi6gxh9e\"]/div/div[2]/div/div/a/div[2]/div")
    WebElement editButtonSecondPhoto;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div/div/div[6]")
    WebElement makeCoverPhoto;
    @FindBy(xpath = "//div[@class=\"l9j0dhe7 ama3r5zh\"]/div/div/div/div/div/div/div[6]/div[2]/div/div/span")
    WebElement makeCoverPhotoText;
    @FindBy(xpath = "//div[@aria-label=\"Save\"]")
    WebElement saveButton;
    @FindBy(xpath = "//div[@aria-label=\"Make Temporary\"]")
    WebElement makeTemporaryPhotoPage;
    @FindBy(xpath = "//div[@class=\"j83agx80 cbu4d94t buofh1pr l9j0dhe7\"]/div/div[3]")
    WebElement deletePhoto;
    @FindBy(xpath = "//div[@role=\"dialog\"]/div[4]/div/div[1]/div[1]")
    WebElement deleteConfirmButton;
    @FindBy(xpath = "//span[contains(text(),'Your photo has been deleted')]")
    WebElement yourPhotoHasBeenDeletedText;



    public void clickOnEditButtonFirstPhoto() {
        click(editButtonFirstPhoto);
    }
    public String getTextMakeProfilePicture() {
        return makeProfilePictureText.getText();
    }
    public void clickOnMakeProfilePicture() {
        click(makeProfilePicture);
    }
    public void clickOmEditButtonSecondPhoto() {
        click(editButtonSecondPhoto);
    }
    public String getTextMakeCoverPhoto() {
        return makeCoverPhotoText.getText();
    }
    public void clickOnMakeCoverPhoto() {
        click(makeCoverPhoto);
    }
    public void clickOnSaveButton() {
        click(saveButton);
    }
    public void clickDeletePhoto() {
        click(deletePhoto);
    }
    public void clickOnDeleteConfirmButton() {
        click(deleteConfirmButton);
    }
    public String getTextYourPhotoHasBeenDeleted() {
        return yourPhotoHasBeenDeletedText.getText();
    }

}
