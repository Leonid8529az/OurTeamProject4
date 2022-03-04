package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffordableSmallBusiness extends OurAPI {
    public AffordableSmallBusiness(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"phoneNumber\"]")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailAddress;

    @FindBy(xpath = "//*[text()='No']")
            public
    WebElement notStateFarmCustomer;

    @FindBy(xpath = "//*[@id=\"policy-type\"]")
    WebElement policyType;

    @FindBy(xpath = "//*[@id=\"street-address\"]")
    WebElement primaryAddress;

    @FindBy(xpath = "//*[@id=\"city\"]")
            public
    WebElement city;

    @FindBy(xpath = "//*[@id=\"state\"]")
    WebElement state;

    @FindBy(xpath = "//*[@id=\"zip\"]")
    WebElement zipCode;

    @FindBy(xpath = "//*[@class=\"-oneX-btn-primary -oneX-btn-medium -oneX-btn-fit-content\"]")
    WebElement submitButton;

    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setPhoneNumber(String number){enterText(phoneNumber,number);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setNotStateFarmCustomer(){click(notStateFarmCustomer);}
    public void setPolicyType(String type){selectDropDownOption(policyType,type);}
    public void setPrimaryAddress(String address){enterText(primaryAddress,address);}
    public void setCity(String yourCity){enterText(city,yourCity);}
    public void setState(String yourState){selectDropDownOption(state,yourState);}
    public void setZipCode(String code){enterText(zipCode,code);}
    public void setSubmitButton(){click(submitButton);}
}
