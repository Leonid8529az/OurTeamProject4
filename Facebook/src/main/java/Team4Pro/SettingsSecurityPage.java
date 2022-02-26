package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsSecurityPage extends OurAPI {
    @FindBy(xpath = "//div[@style=\"height: 429.828px;\"]/div/div/div[3]/div/div/div")
    WebElement settingsAndPrivacy;
    @FindBy(xpath = "//div[@style=\"transform: translateX(0%) translateZ(1px);\"]/div/div[2]/div/div/a/div")
    WebElement settings;
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/settings?tab=security\"]")
    WebElement securityAndLogin;
    @FindBy(xpath = "//div[@id='headerArea']/div/div/div[2]/h2")
    WebElement securityAndLoginText;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/div[2]/div/div/div/div[3]/div[2]/table/tbody/tr/td[3]/button")
    WebElement passwordEditButton;
    @FindBy(xpath = "//label[@for='password_old']")
    WebElement oldPasswordText;
    @FindBy(xpath = "//input[@id='password_old']")
    WebElement oldPasswordField;
    @FindBy(xpath = "//label[@for='password_new']")
    WebElement newPasswordText;
    @FindBy(xpath = "//input[@id='password_new']")
    WebElement newPasswordField;
    @FindBy(xpath = "//label[@for='password_confirm']")
    WebElement confirmPasswordText;
    @FindBy(xpath = "//input[@id='password_confirm']")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//div[@id='password']/div/div/form/div/div[2]/div/label")
    WebElement saveChanges;
    @FindBy(xpath = "//div[@class='_4t2a']/div/form/div[2]/div[3]/label[2]")
    WebElement stayLoggedIn;
    @FindBy(xpath = "//button[@class='_42ft _4jy0 layerConfirm uiOverlayButton _4jy4 _4jy1 selected _51sy']")
    WebElement continueChangePass;
    @FindBy(xpath = "//form[@action='https://www.facebook.com/ajax/login/password/change_reason/dialog']/div/div/div[2]/h3")
    WebElement passwordChangedText;
    @FindBy(xpath = "//span[@class='uiIconText']")
    WebElement iConText;

    public void settingsAndPrivacy() {
        click(settingsAndPrivacy);
    }
    public void settings() {
        click(settings);
    }
    public void securityAndLogin() {
        click(securityAndLogin);
    }
    public String getTextSecurityAndLogin() {
        return securityAndLoginText.getText();
    }
    public void passwordEditButton() {
        click(passwordEditButton);
    }
    public String getTextOldPassword() {
        return oldPasswordText.getText();
    }
    public void oldPassword(String oldPassword) {
        feedDataWithNoClick(oldPasswordField,oldPassword);
    }
    public String getTextNewPassword() {
        return newPasswordText.getText();
    }
    public void newPassword(String newPassword) {
        feedDataWithNoClick(newPasswordField,newPassword);
    }
    public String getTextConfirmPassword() {
        return confirmPasswordText.getText();
    }
    public void confirmPassword(String newPassword) {
        feedDataWithNoClick(confirmPasswordField,newPassword);
    }
    public void saveChanges() {
        click(saveChanges);
    }
    public void stayLoggedIn() {
        click(stayLoggedIn);
    }
    public String passwordChanged() {
        return passwordChangedText.getText();
    }
    public void continueChangePass() {
        click(continueChangePass);
    }
    public String iconTextPass() {
        return iConText.getText();
    }
}
