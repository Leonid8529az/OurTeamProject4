package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodFor100 extends OurAPI {
    public GoodFor100(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"register\"]")
            public
    WebElement register;

    @FindBy(xpath = "//*[text()='Good Neighbor (Public)']")
            public
    WebElement status;

    @FindBy(xpath = "//*[@class='-oneX-textfield__input -oneX-textfield--control']")
            public
    WebElement dateOfBirth;

    @FindBy(xpath = "//*[@id=\"verifiyAgeSubmit\"]")
            public
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"public_email\"]")
            public
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"complete-profile-info-btn\"]")
            public
    WebElement continueButton;



    public void setRegister(){click(register);}
    public void setStatus(){click(status);}
    public void setContinueButton(){click((continueButton));}
    public void setDateOfBirth(String date){enterText(dateOfBirth,date);}
    public void setSubmitButton(){click(submitButton);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}



}
