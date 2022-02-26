package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends OurAPI {
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
}
