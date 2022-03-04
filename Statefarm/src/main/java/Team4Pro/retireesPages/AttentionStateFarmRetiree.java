package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttentionStateFarmRetiree extends OurAPI {
    public AttentionStateFarmRetiree(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='formelement_30732']")
            public
    WebElement name;

    @FindBy(xpath = "//*[@id='formelement_30733']")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id='formelement_30734']")
    WebElement streetAddress;

    @FindBy(xpath = "//*[@id='formelement_30735']")
    WebElement city;

    @FindBy(xpath = "//*[@id='formelement_30736']")
            public
    WebElement state;

    @FindBy(xpath = "//*[@id='formelement_30737']")
    public
    WebElement zipcode;

    @FindBy(xpath = "//*[@class=\" form_input_required \"]")
            public
    WebElement agreeFor;

    @FindBy(xpath = "//*[@type=\"submit\"]")
            public
    WebElement signupButton;

    public void setName(String yourName){enterText(name,yourName);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setStreetAddress(String address){enterText(streetAddress,address);}
    public void setCity(String yourCity){enterText(city,yourCity);}
    public void setState(String yourState){enterText(state,yourState);}
    public void setZipcode(String zip){enterText(zipcode,zip);}
    public void setAgreeFor(){click(agreeFor);}
    public void setSignupButton(){click(signupButton);}
}
