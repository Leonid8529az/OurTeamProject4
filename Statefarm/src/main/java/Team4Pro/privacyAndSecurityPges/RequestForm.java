package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestForm extends OurAPI {
    public RequestForm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"firstNameId\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastNameId\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"mainAddressLine1Id\"]")
    WebElement streetAddress;

    @FindBy(xpath = "//*[@id=\"mainCityId\"]")
    WebElement city;

    @FindBy(xpath = "//*[@id=\"mainStateId\"]")
    WebElement state;

    @FindBy(xpath = "//*[@id=\"mainNormalizeZipId\"]")
    WebElement zipcode;

    @FindBy(xpath = "//*[@id=\"dobId\"]")
    WebElement dateOfBirth;

    @FindBy(xpath = "//*[@id=\"dayPhoneId\"]")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"ssnId\"]")
    WebElement socialSecurity;

    @FindBy(xpath = "//*[@id=\"associateType2Id\"]")
            public
    WebElement relationship;

    @FindBy(xpath = "//*[text()='Request for my personal information from State Farm']")
            public
    WebElement formReason;

    @FindBy(xpath = "//*[@id=\"delivery_mode2Id\"]")
            public
    WebElement responsePreference;

    @FindBy(xpath = "//*[@id=\"delivery_mode_format0Id\"]")
            public
    WebElement responseMethod;

    @FindBy(xpath = "//*[@id=\"emailId\"]")
    WebElement emailAddress;

    @FindBy(xpath = "(//*[@type=\"submit\"])[5]")
    WebElement nextButton;


    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setStreetAddress(String address){enterText(streetAddress,address);}
    public void setCity(String yourCity){enterText(city,yourCity);}
    public void setState(String yourState){selectDropDownOption(state,yourState);}
    public void setZipcode(String zip){enterText(zipcode,zip);}
    public void setDateOfBirth(String date){enterText(dateOfBirth,date);}
    public void setPhoneNumber(String phone){enterText(phoneNumber,phone);}
    public void setSocialSecurity(String ssn){enterText(socialSecurity,ssn);}
    public void setRelationship(){click(relationship);}
    public void setFormReason(){click(formReason);}
    public void setResponsePreference(){click(responsePreference);}
    public void setResponseMethod(){click(responseMethod);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setNextButton(){click(nextButton);}
}
