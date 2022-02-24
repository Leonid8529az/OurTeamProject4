package Team4Pro.quotePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CondoQuote extends OurAPI {
    public CondoQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"firstName-sfxid_3\"]")
    WebElement firstNameForCondoQuote;
    @FindBy(xpath = "//*[@id=\"lastName-sfxid_5\"]")
    WebElement lastNameForCondoQuote;
    @FindBy(xpath = "//*[@id=\"suffix-sfxid_6\"]")
    WebElement suffixForCondoQuote;
    @FindBy(xpath = "//*[@id=\"street1-sfxid_7\"]")
    WebElement addressForCondoQuote;
    @FindBy(xpath = "//*[@id=\"city-sfxid_9\"]")
    WebElement cityForCondoQuote;
    @FindBy(xpath = "//*[@id=\"postalCodeFMT-sfxid_10\"]")
    WebElement zipCodeForCondoQuote;
    @FindBy(xpath = "//*[@name=\"primaryApplicantDOB__2\"]")
    WebElement monthOfBirthForCondoQuote;
    @FindBy(xpath = "//*[@name=\"primaryApplicantDOB__1\"]")
    WebElement dayOfBirthForCondoQuote;
    @FindBy(xpath = "//*[@name=\"primaryApplicantDOB__3\"]")
    WebElement yearOfBirthForCondoQuote;
    @FindBy(xpath = "//*[@id=\"buttonContinueId\"]")
    public
    WebElement continueButtonForCondoQuote;


    public void setFirstNameForCondoQuote(String firstName){enterText(firstNameForCondoQuote,firstName);}
    public void setLastNameForCondoQuote(String lastName){enterText(lastNameForCondoQuote,lastName);}
    public void setSuffixForCondoQuote(String suffix){selectDropDownOption(suffixForCondoQuote,suffix);}
    public void setAddressForCondoQuote(String address){enterText(addressForCondoQuote,address);}
    public void setCityForCondoQuote(String city){enterText(cityForCondoQuote,city);}
    public void setZipCodeForCondoQuote(String zipCode){enterText(zipCodeForCondoQuote,zipCode);}
    public void setMonthOfBirthForCondoQuote(String dateOfBirth){enterText(monthOfBirthForCondoQuote,dateOfBirth);}
    public void setDayOfBirthForCondoQuote(String dateOfBirth){enterText(dayOfBirthForCondoQuote,dateOfBirth);}
    public void setYearOfBirthForCondoQuote(String dateOfBirth){enterText(yearOfBirthForCondoQuote,dateOfBirth);}
    public void setContinueButtonForCondoQuote(){click(continueButtonForCondoQuote);}
}
