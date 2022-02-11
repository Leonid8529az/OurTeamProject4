package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebElementsLibrary extends OurAPI {

    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement loginEmailField;
    @FindBy(xpath = "//*[@id='pass']")
    WebElement loginPasswordField;
    @FindBy(xpath = "//*[@data-testid=\"royal_login_button\"]")
    WebElement logInButton;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[1]/span")
    WebElement myNameHolder;
    @FindBy(xpath = "//*[@id='email_container']/div[2]")
    WebElement invalidEmail;
    @FindBy(xpath = "//button[@autofocus ='1']")
    WebElement continueButtonOnLogin;
    @FindBy(xpath = "//*[@id=\"loginform\"]/div[2]/div[2]")
    WebElement invalidPassword;
    @FindBy(xpath = "//*[@id=\"error_box\"]/div[1]")
    WebElement pleaseConfirmPassword;
    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement loginButtonWhenYouMadeIncorrectPassword;
    @FindBy(xpath = "//div[@role=\"banner\"]/div[4]/div/span/div/div")
    WebElement theDropDownButton;
    @FindBy(xpath = "//div[@data-nocookies=\"true\"]")
    WebElement logOutButton;
    @FindBy(xpath = "//button[@autofocus='1']")
    WebElement yesContinueButton;
    @FindBy(xpath = "//div[@role='dialog']/div/div/div/div/div[2]")
    WebElement continueAsLeonid;
    @FindBy(xpath = "//img[@aria-label ='Leonid Leonid']")
    WebElement recentLogins;
    @FindBy(xpath = "//form[@action='/login/device-based/regular/login/']/div")
    WebElement myNameOnSuggestion;
    @FindBy(xpath = "//div[@role='dialog']/div/div/div/div/form/div[4]/button")
    WebElement oneMoreLoginClicker;
    @FindBy(xpath = "//input[@tabindex='0']")
    WebElement passwordFieldWhenYouInputItAgain;


    public void emailFeed(String emailToInput) {
        feedDataWithNoClick(loginEmailField, emailToInput);
    }

    public void passwordFeed(String passwordToInput) {
        feedDataWithNoClick(loginPasswordField, passwordToInput);
    }

    public void clickOnLogIn() {
        click(logInButton);
    }

    public String nameOnTheGreetingPage() {
        return myNameHolder.getText();
    }

    public String messageOgInvalidEmail() {
        return invalidEmail.getText();
    }

    public void clickOnContinueButton() {
        click(continueButtonOnLogin);
    }

    public void clickOnLoginButtonWhenThePasswordIsIncorrect() {
        click(loginButtonWhenYouMadeIncorrectPassword);
    }

    public void clickOnDropDownButtinByProfile() {
        click(theDropDownButton);
    }

    public void clickOnLogOutButton() {
        click(logOutButton);
    }

    public void yesContinueClick() {
        click(yesContinueButton);
    }

    public String textContinueAsLeonid() {
        return continueAsLeonid.getText();
    }

    public void clickOnRecentLogins() {
        click(recentLogins);
    }

    public String myNameForAssertion() {
        return myNameOnSuggestion.getText();
    }

    public void clickOnAnotherLogIn() {
        click(oneMoreLoginClicker);
    }

    public void insertPasswordToThePopUp(String passwordToInput) {
        feedDataWithNoClick(passwordFieldWhenYouInputItAgain, passwordToInput);
    }
    //New Test Scenario TS-002
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



    public void settingsAndPrivacy_FBTesting_008() {
        click(settingsAndPrivacy);
    }
    public void settings_FBTesting_008() {
        click(settings);
    }
    public void securityAndLogin_FBTesting_008() {
        click(securityAndLogin);
    }
    public String getTextSecurityAndLogin_FBTesting_008() {
        return securityAndLoginText.getText();
    }
    public void passwordEditButton_FBTesting_008() {
        click(passwordEditButton);
    }
    public String getTextOldPassword_FBTesting_008() {
        return oldPasswordText.getText();
    }
    public void oldPassword_FBTesting_08(String oldPassword) {
        feedDataWithNoClick(oldPasswordField,oldPassword);
    }
    public String getTextNewPassword_FBTesting_008() {
        return newPasswordText.getText();
    }
    public void newPassword_FBTesting_08(String newPassword) {
        feedDataWithNoClick(newPasswordField,newPassword);
    }
    public String getTextConfirmPassword_FBTesting_008() {
        return confirmPasswordText.getText();
    }
    public void confirmPassword_FBTesting_008(String newPassword) {
        feedDataWithNoClick(confirmPasswordField,newPassword);
    }
    public void saveChanges_FBTesting_008() {
        click(saveChanges);
    }
    public void stayLoggedIn_FBTesting_008() {
        click(stayLoggedIn);
    }
    public String passwordChanged_FBTesting_008() {
        return passwordChangedText.getText();
    }
    public void continueChangePass_FBTesting_008() {
        click(continueChangePass);
    }
    public String iconTextPass_FBTesting_009() {
        return iConText.getText();
    }

    //New Test Scenario TS-003
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


    public void clickOnEdit_FBTesting_011() {
        click(editByName);
    }
    public String getTextGeneral_FBTesting_011() {
        return generalAccountSettingsText.getText();
    }
    public String getTextFirstName_FBTesting_011() {
        return firstNameText.getText();
    }
    public String getTextMiddleName_FBTesting_011() {
        return middleNameText.getText();
    }
    public String getTextLastName_FBTesting_011() {
        return lastNameText.getText();
    }
    public void insertPass_FBTesting_011(String password) {
        feedDataWithNoClick(popUpPassword,password);
    }
    public String getPassText_FBTesting_011() {
        return popUpPasswordText.getText();
    }
    public void cancelClick_FBTesting_011() {
        click(canelButton);
    }
    public void clickOnReview_FBTesting_011() {
        click(reviewChanges);
    }
}
