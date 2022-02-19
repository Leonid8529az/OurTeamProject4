package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsGeneralPage extends OurAPI {
    @FindBy(xpath = "//iframe[@tabindex='-1']")
    WebElement iFrame;
    @FindBy(xpath = "//li[@data-testid='settings_section_name']/a")
    WebElement editByName;
    @FindBy(xpath = "//div[@class='clearfix uiHeaderTop']/div/h2")
    WebElement generalAccountSettingsText;
    @FindBy(xpath = "//table[@role='presentation']/tbody/tr/th/label")
    WebElement firstNameText;
    @FindBy(xpath = "//table[@role='presentation']/tbody/tr[2]/th/label")
    WebElement middleNameText;
    @FindBy(xpath = "//table[@role='presentation']/tbody/tr[3]/th/label")
    WebElement lastNameText;
    @FindBy(xpath = "//input[@name='primary_first_name']")
    WebElement nameField;
    @FindBy(xpath = "//input[@name='primary_middle_name']")
    WebElement middleNameField;
    @FindBy(xpath = "//input[@name='primary_last_name']")
    WebElement lastNameField;
    @FindBy(xpath = "//form[@action='https://www.facebook.com/ajax/settings/account/name.php']/div[2]/table/tbody/tr/td/input")
    WebElement popUpPassword;
    @FindBy(xpath = "//div[@class='_4t2a']/div/form/div[2]/table/tbody/tr/th/label")
    WebElement popUpPasswordText;
    @FindBy(xpath = "//tr[@class='_51mx']/td[2]/a")
    WebElement canelButton;
    @FindBy(xpath = "//div[@class='mtm uiBoxGray topborder']/div/div/div/button")
    WebElement reviewChanges;
    @FindBy(xpath = "//div[@class='pam fbSettingsError uiBoxRed noborder']/div/span")
    WebElement errorMessageBox;
    @FindBy(xpath = "//li[@data-testid='settings_section_email']/a")
    WebElement editByContact;
    @FindBy(xpath = "//div[@class='fbSettingsEditor uiBoxGray noborder']/div/div[2]/div/div/div/div/div[2]/div/a")
    WebElement makePrimary;
    @FindBy(xpath = "//div[@data-testid='sec_ac_dialog']/div[2]/div/div/div/div[2]/div[4]/span/input")
    WebElement inputPassWhenYouMakeEmailPrimary;
    @FindBy(xpath = "//div[@class='fbSettingsEditor uiBoxGray noborder']/div/div[2]/div/div/div/a")
    WebElement addAnotherEmail;
    @FindBy(xpath = "//input[@name='new_email']")
    WebElement newEmailField;
    @FindBy(xpath = "//button[@class='_42ft _4jy0 layerConfirm uiOverlayButton _4jy3 _4jy1 selected _51sy']")
    WebElement addButton;
    @FindBy(xpath = "//div[@class='_4-i2 _pig _50f4']")
    WebElement addEmailConfirmMessage;
    @FindBy(xpath = "//div[@class='_t _9l18']/div/div/div/div[2]/span/div")
    WebElement emailIsInUseText;
    @FindBy(xpath = "//div[@class='fbSettingsEditor uiBoxGray noborder']/div/div[2]/div/div/div/div/div[3]/a[3]")
    WebElement removeEmailButton;
    @FindBy(xpath = "//div[@class='fbSettingsEditor uiBoxGray noborder']/div/div/div/div/div/div/div/span")
    WebElement pendingEmail;

    public void clickOnEdit() {
        click(editByName);
    }
    public String getTextGeneral() {
        return generalAccountSettingsText.getText();
    }
    public String getTextFirstName() {
        return firstNameText.getText();
    }
    public String getTextMiddleName() {
        return middleNameText.getText();
    }
    public String getTextLastName() {
        return lastNameText.getText();
    }
    public void insertPass(String password) {
        feedDataWithNoClick(popUpPassword,password);
    }
    public String getPassText() {
        return popUpPasswordText.getText();
    }
    public void cancelClick() {
        click(canelButton);
    }
    public void clickOnReview() {
        click(reviewChanges);
    }
    public String errorMessageGetText() {
        return errorMessageBox.getText();
    }
    public void clickOnEditByContact() {
        click(editByContact);
    }
    public void clickOnMakePrimary() {
        click(makePrimary);
    }
    public void inputPassForPrimaryEmail(String text) {
        feedDataWithNoClick(inputPassWhenYouMakeEmailPrimary,text);
    }
    public void clickOnAddAnotherEmail() {
        click(addAnotherEmail);
    }
    public void inputNewEmail(String email) {
        feedDataWithNoClick(newEmailField,email);
    }
    public void clickOnAdd() {
        click(addButton);
    }
    public String addEmailConfirmMessageGetText() {
        return addEmailConfirmMessage.getText();
    }
    public String emailIsInUseGetText() {
        return emailIsInUseText.getText();
    }
    public void clickOnRemoveButton() {
        click(removeEmailButton);
    }
    public void refreshThisPage() {
        driver.findElement(By.xpath("//div[@class='fbSettingsEditor uiBoxGray noborder']/div/div[2]/div/div/div/div/div[3]/a[3]")).sendKeys(Keys.F5);
    }

}
