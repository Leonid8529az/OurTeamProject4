package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeToCandoQuote extends OurAPI {
    public WelcomeToCandoQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"firstName-sfxid_3\"]")
    WebElement firstNameForCandoQuote;
    @FindBy(xpath = "//*[@id=\"lastName-sfxid_5\"]")
    WebElement lastNameForCandoQuote;
    @FindBy(xpath = "//*[@id=\"suffix-sfxid_6\"]")
    WebElement suffixForCandoQuote;
    @FindBy(xpath = "//*[@id=\"street1-sfxid_7\"]")
    WebElement addressForCandoQuote;
    @FindBy(xpath = "//*[@id=\"city-sfxid_9\"]")
    WebElement cityForCandoQuote;
    @FindBy(xpath = "//*[@name=\"primaryApplicantDOB__1\"]")
    WebElement monthOfBirthForCandoQuote;
    @FindBy(xpath = "//*[@name=\"primaryApplicantDOB__2\"]")
    WebElement dayOfBirthForCandoQuote;
    @FindBy(xpath = "//*[@name=\"primaryApplicantDOB__3\"]")
    WebElement yearOfBirthForCandoQuote;
    @FindBy(xpath = "//*[@id=\"buttonContinueId\"]")
    public
    WebElement continueForCandoQuote;

    public void setFirstNameForCandoQuote(String firstName){enterText(firstNameForCandoQuote,firstName);}
    public void setLastNameForCandoQuote(String lastName){enterText(lastNameForCandoQuote,lastName);}
    public void setSuffixForCandoQuote(String option){selectDropDownOption(suffixForCandoQuote,option);}
    public void setAddressForCandoQuote(String address){enterText(addressForCandoQuote,address);}
    public void setCityForCandoQuote(String city){enterText(cityForCandoQuote,city);}
    public void setMonthOfBirthForCandoQuote(String month){enterText(monthOfBirthForCandoQuote,month);}
    public void setDayOfBirthForCandoQuote(String day){enterText(dayOfBirthForCandoQuote,day);}
    public void setYearOfBirthForCandoQuote(String year){enterText(yearOfBirthForCandoQuote,year);}
    public void setContinueForCandoQuote(){click(continueForCandoQuote);}
}
