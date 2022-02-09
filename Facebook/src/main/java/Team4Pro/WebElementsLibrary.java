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

    public void emailFeed(String emailToInput) {
        feedDataWithNoClick(loginEmailField,emailToInput);
    }
    public void passwordFeed(String passwordToInput) {
        feedDataWithNoClick(loginPasswordField,passwordToInput);
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
}
