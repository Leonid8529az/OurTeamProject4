package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttentionStateFarm extends OurAPI {
    public AttentionStateFarm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='formelement_30732']")
    WebElement nameToSignUp;
    @FindBy(xpath = "//input[@id='formelement_30733']")
    WebElement emailToSignUp;
    @FindBy(xpath = "//input[@id='formelement_30734']")
    WebElement addressToSignUp;
    @FindBy(xpath = "//input[@id='formelement_30735']")
    WebElement cityToSignUp;
    @FindBy(xpath = "//input[@id='formelement_30736']")
    WebElement stateToSignUp;
    @FindBy(xpath = "//input[@id='formelement_30737']")
    WebElement zipCodeToSignUp;
    @FindBy(xpath = "//*[@name='element[30738][]']")
    WebElement agreeToSignUp;
    @FindBy(xpath = "//*[@type=\"submit\"]")
    WebElement signUpButton;



    public void setNameToSignUp(String name){enterText(nameToSignUp,name);}
    public void setEmailToSignUp(String email){enterText(emailToSignUp,email);}
    public void setAddressToSignUp(String address){enterText(addressToSignUp,address);}
    public void setCityToSignUp(String city){enterText(cityToSignUp,city);}
    public void setStateToSignUp(String state){enterText(stateToSignUp,state);}
    public void setZipCodeToSignUp(String zipcode){enterText(zipCodeToSignUp,zipcode);}
    public void setAgreeToSignUp(){click(agreeToSignUp);}
    public void setSignUpButton(){click(signUpButton);}

}
