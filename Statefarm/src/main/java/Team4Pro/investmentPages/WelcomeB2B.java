package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeB2B extends OurAPI {
    public WelcomeB2B(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"businessType\"]")
    WebElement businessType;

    @FindBy(xpath = "//*[@id=\"reason\"]")
    WebElement reasonForContact;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"emailAddress\"]")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"phoneNumber\"]")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"taxId\"]")
    WebElement taxId;

    @FindBy(xpath = "//*[@id=\"npiId\"]")
            public
    WebElement NPIId;

    @FindBy(xpath = "//*[@id=\"companyName\"]")
    WebElement companyName;

    @FindBy(xpath = "//*[@id=\"companyUrl\"]")
    WebElement companyWeb;

    @FindBy(xpath = "//*[@id=\"fax\"]")
    WebElement faxNumber;
    @FindBy(xpath = "//*[text()=\"No\"]")
            public
    WebElement noForStateFarm;

    @FindBy(xpath = "//*[@id=\"sfRepresentativeName\"]")
    WebElement nameOfRepresentative;

    @FindBy(xpath = "//*[@id=\"country\"]")
    WebElement country;

    @FindBy(xpath = "//*[@id=\"streetAddress\"]")
    WebElement streetAddress;

    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement city;

    @FindBy(xpath = "(//*[@id=\"state\"])[1]")
    WebElement state;

    @FindBy(xpath = "(//*[@id=\"zipCode\"])[1]")
    WebElement zipcode;

    @FindBy(xpath = "//*[@id=\"mailingAddress\"]")
    WebElement fullMailing;

    @FindBy(xpath = "//*[@id=\"comments\"]")
    WebElement comment;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    WebElement submitButton;



    public void setBusinessType(String type){selectDropDownOption(businessType,type);}
    public void setReasonForContact(String reason){selectDropDownOption(reasonForContact,reason);}
    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setPhoneNumber(String phone){enterText(phoneNumber,phone);}
    public void setTaxId(String id){enterText(taxId,id);}
    public void setNPIId(String id){enterText(NPIId,id);}
    public void setCompanyName (String company){enterText(companyName,company);}
    public void setCompanyWeb(String web){enterText(companyWeb,web);}
    public void setFaxNumber(String fax){enterText(faxNumber,fax);}
    public void setNoForStateFarm(){click(noForStateFarm);}
    public void setNameOfRepresentative(String name){enterText(nameOfRepresentative,name);}
    public void setCountry(String yourCountry){selectDropDownOption(country,yourCountry);}
    public void setStreetAddress(String address){enterText(streetAddress,address);}
    public void setCity(String yourCity){enterText(city,yourCity);}
    public void setState(String yourState){selectDropDownOption(state,yourState);}
    public void setZipcode(String zip){enterText(zipcode,zip);}
    public void setFullMailing(String mailing){enterText(fullMailing,mailing);}
    public void setComment(String text){enterText(comment,text);}
    public void setSubmitButton(){click(submitButton);}

}
