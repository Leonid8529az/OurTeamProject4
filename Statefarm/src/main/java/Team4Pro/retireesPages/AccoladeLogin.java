package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccoladeLogin extends OurAPI {
    public AccoladeLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"username-input\"]")
    WebElement userName;
    @FindBy(xpath = "//*[@id=\"password-input\"]")
    WebElement password;
    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    WebElement loginButton;

    public void setUserName(String number){enterText(userName,number);}
    public void setPassword(String pass){enterText(password,pass);}
    public void setLoginButton (){click(loginButton);}
}
