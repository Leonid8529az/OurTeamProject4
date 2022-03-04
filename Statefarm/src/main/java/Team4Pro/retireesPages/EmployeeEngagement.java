package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeEngagement extends OurAPI {
    public EmployeeEngagement(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Create your password']")
    WebElement createPassword;

    @FindBy(xpath = "//*[@id=\"xfirstinitial\"]")
    WebElement firstInitial;
    @FindBy(xpath = "//*[@id=\"xlastname\"]")
    WebElement lastInitial;
    @FindBy(xpath = "//*[@id=\"xdonorcode\"]")
    WebElement associateId;
    @FindBy(xpath = "//*[@id=\"xpassword\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"xpassword2\"]")
    WebElement passwordConfirmation;
    @FindBy(xpath = "//*[@id=\"xemailaddress\"]")
    WebElement emailAddress;
    @FindBy(xpath = "//*[@id=\"primaryAction\"]")
    public
    WebElement submitButton;



    public void setCreatePassword(){click(createPassword);}
    public void setFirstInitial(String first){enterText(firstInitial,first);}
    public void setLastInitial(String last){enterText(lastInitial,last);}
    public void setAssociateId(String id){enterText(associateId,id);}
    public void setPassword(String pass){enterText(password,pass);}
    public void setPasswordConfirmation(String pass){enterText(passwordConfirmation,pass);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setSubmitButton(){click(submitButton);}


}
