package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VentureOffice extends OurAPI {
    public VentureOffice(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@type=\"button\"])[1]")
    WebElement contactUs;

    @FindBy(xpath = "//*[@id=\"firstNameId\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"lastNameId\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"companyNameId\"]")
    WebElement companyName;

    @FindBy(xpath = "//*[@id=\"emailId\"]")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"confirmEmailId\"]")
    WebElement emailConfirmation;

    @FindBy(xpath = "//*[@id=\"zipId\"]")
    WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"phoneNumberId\"]")
    WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"websiteId\"]")
    WebElement webSite;

    @FindBy(xpath = "//*[@id=\"messageId\"]")
    WebElement project;

    @FindBy(xpath = "//*[@id=\"sourcesId\"]")
    WebElement hearAboutUs;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"contact-form-iframe\"]")
            public
    WebElement frame;

    public void setContactUs(){click(contactUs);}
    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setCompanyName(String company){enterText(companyName,company);}
    public void setEmailAddress(String email){enterText(emailAddress,email);}
    public void setEmailConfirmation(String confirmation){enterText(emailConfirmation,confirmation);}
    public void setZipCode(String zip){enterText(zipCode,zip);}
    public void setPhoneNumber(String phone){enterText(phoneNumber,phone);}
    public void setWebSite(String web){enterText(webSite,web);}
    public void setProject(String text){enterText(project,text);}
    public void setHearAboutUs(String option){selectDropDownOption(hearAboutUs,option);}
    public void setSubmitButton(){click(submitButton);}


    public void setFrame(){}
}
