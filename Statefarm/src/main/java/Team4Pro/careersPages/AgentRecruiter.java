package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentRecruiter extends OurAPI {

    public AgentRecruiter(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement firstNameForRecruiter;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    WebElement lastNameForRecruiter;
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailForRecruiter;
    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    WebElement zipCodeForRecruiter;
    @FindBy(xpath = "//*[@id=\"phoneNumber\"]")
    WebElement phoneNumberForRecruiter;
    @FindBy(xpath = "//*[@id=\"careersCampaignDropdown\"]")
            public
    WebElement learnAboutOpportunityForRecruiter;
    @FindBy(xpath = "//*[@id=\"careerFormSubmit\"]")
    WebElement submitForRecruiter;


    public void setFirstNameForRecruiter(String firstName){enterText(firstNameForRecruiter,firstName);}
    public void setLastNameForRecruiter(String lastName){enterText(lastNameForRecruiter,lastName);}
    public void setEmailForRecruiter(String email){enterText(emailForRecruiter,email);}
    public void setZipCodeForRecruiter(String zipCode){enterText(zipCodeForRecruiter,zipCode);}
    public void setPhoneNumberForRecruiter(String phone){enterText(phoneNumberForRecruiter,phone);}
    public void setLearnAboutOpportunityForRecruiter(String option){selectDropDownOption(learnAboutOpportunityForRecruiter,option);}
    public void setSubmitForRecruiter(){click(submitForRecruiter);}
}
