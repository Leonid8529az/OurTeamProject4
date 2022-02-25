package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SponsorShipSubmission extends OurAPI {
    public SponsorShipSubmission(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"id_salutation\"]")
    WebElement salutation;
    @FindBy(xpath = "//*[@id=\"id_first_name\"]")
    WebElement firstName;
    @FindBy(xpath = "//*[@id=\"id_last_name\"]")
    WebElement lastName;
    @FindBy(xpath = "//*[@id=\"id_job_title\"]")
    WebElement jobTitle;
    @FindBy(xpath = "//*[@id=\"id_company\"]")
    WebElement companyName;
    @FindBy(xpath = "//*[@id=\"id_street_address\"]")
    WebElement address;
    @FindBy(xpath = "//*[@id=\"id_city\"]")
    WebElement city;
    @FindBy(xpath = "//*[@id=\"id_state\"]")
    WebElement state;
    @FindBy(xpath = "//*[@id=\"id_zip_code\"]")
    WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"id_country\"]")
    WebElement county;
    @FindBy(xpath = "//*[@id=\"id_phone\"]")
    WebElement phoneNumber;
    @FindBy(xpath = "//*[@id=\"id_fax\"]")
    WebElement fax;
    @FindBy(xpath = "//*[@id=\"id_email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"id_website\"]")
    WebElement companyWebsite;
    @FindBy(xpath = "//*[@id=\"id_sf_agent\"]")
    WebElement areYouAStateFarmAgent;
    @FindBy(xpath = "")
    WebElement proposalName;
    @FindBy(xpath = "")
    WebElement proposalDate;
    @FindBy(xpath = "")
    WebElement proposalCategory;
    @FindBy(xpath = "")
    WebElement annualPrice;
    @FindBy(xpath = "")
    WebElement sponsorGeography;
    @FindBy(xpath = "")
    WebElement text;
    @FindBy(xpath = "")
    WebElement proposalTerm;
    @FindBy(xpath = "")
    WebElement event;
    @FindBy(xpath = "")
    WebElement textForEvent;
    @FindBy(xpath = "")
    WebElement evenStartDate;
    @FindBy(xpath = "")
    WebElement eventEndDate;
    @FindBy(xpath = "")
    WebElement addSponsor;
    @FindBy(xpath = "")
    WebElement level;
    @FindBy(xpath = "")
    WebElement insurancePartner;
    @FindBy(xpath = "")
    WebElement totalAttendance;
    @FindBy(xpath = "")
    WebElement sponsorDeadline;
    @FindBy(xpath = "")
    WebElement mediaAdvertising;
    @FindBy(xpath = "")
    WebElement partnerInvolved;
    @FindBy(xpath = "")
    WebElement mediaBroadcast;
    @FindBy(xpath = "")
    WebElement involveSignage;
    @FindBy(xpath = "")
    WebElement questionText;
    @FindBy(xpath = "")
    WebElement save;



    public void setSalutation(String suffix){selectDropDownOption(salutation,suffix);}
    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setJobTitle(String job){enterText(jobTitle,job);}
    public void setCompanyName(String company){enterText(companyName,company);}
    public void setAddress(String street){enterText(address,street);}
    public void setCity(String yourCity){enterText(city,yourCity);}
    public void setState(String yourState){selectDropDownOption(state,yourState);}
    public void setZipCode(String code){enterText(zipCode,code);}
    public void setCounty(String yourCounty){enterText(county,yourCounty);}
    public void setPhoneNumber(String phone){enterText(phoneNumber,phone);}
    public void setFax(String number){enterText(fax,number);}
    public void setEmail(String yourEmil){enterText(email,yourEmil);}
    public void setCompanyWebsite(String web){enterText(companyWebsite,web);}
    public void setAreYouAStateFarmAgent(String answer){selectDropDownOption(areYouAStateFarmAgent,answer);}





}
