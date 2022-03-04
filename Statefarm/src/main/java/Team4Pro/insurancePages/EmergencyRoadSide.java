package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmergencyRoadSide extends OurAPI {
    public EmergencyRoadSide(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"start-request\"]")
    WebElement startRequest;

    @FindBy(xpath = "//*[@id=\"userId\"]")
    WebElement userId;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginmain\"]")
    WebElement loginButton;


    public void setStartRequest(){click(startRequest);}
    public void setUserId(String user){enterText(userId,user);}
    public void setPassword(String pass){enterText(password,pass);}
    public void setLoginButton(){click(loginButton);}
}
