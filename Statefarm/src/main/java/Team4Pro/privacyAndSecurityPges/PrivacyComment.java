package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyComment extends OurAPI {
    public PrivacyComment(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"firstNameId\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastNameId\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"mailingAddressLineOneId\"]")
    WebElement streetAddress;

    @FindBy(xpath = "//*[@id=\"mailingAddressCityId\"]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"mailingAddressStateId\"]")
    WebElement state;

    @FindBy(xpath = "//*[@id=\"mailingAddressNormalizedZipId\"]")
    WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"emailId\"]")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"notesId\"]")
            public
    WebElement comment;

    @FindBy(xpath = "//*[text()='Next']")
    WebElement submitButton;


    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setStreetAddress(String address){enterText(streetAddress,address);}
    public void setCity(String yourCity){enterText(city,yourCity);}
    public void setState(String yourState){selectDropDownOption(state,yourState);}
    public void setZipCode(String zip){enterText(zipCode,zip);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setComment(String text){enterText(comment,text);}
    public void setSubmitButton(){click(submitButton);}

}
