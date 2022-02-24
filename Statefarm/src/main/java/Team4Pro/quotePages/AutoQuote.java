package Team4Pro.quotePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoQuote extends OurAPI {
    public AutoQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"first_name\"]")
    WebElement firstNameForAutoQuote;
    @FindBy(xpath = "//*[@id=\"last_name\"]")
    WebElement lastNameForAutoQuote;
    @FindBy(xpath = "//span[@id='suffix_name-button']")
    WebElement suffixForAutoQuote;
    @FindBy(xpath = "//*[@id=\"street1\"]")
    WebElement addressForAutoQuote;
    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement cityForAutoQuote;
    @FindBy(xpath = "//*[@id=\"zipPostalCode\"]")
    WebElement zipCodeForAutoQuote;
    @FindBy(xpath = "//*[@id=\"date_of_birth\"]")
    WebElement dateOfBirthForAutoQuote;
    @FindBy(xpath = "//*[@id=\"btnContinue\"]")
    WebElement nextForAutoQuote;

    public void setFirstNameForAutoQuote(String firstName){enterText(firstNameForAutoQuote,firstName);}
    public void setLastNameForAutoQuote(String lastName){enterText(lastNameForAutoQuote,lastName);}
    public void setSuffixForAutoQuote(String suffix){selectDropDownOption(suffixForAutoQuote,suffix);}
    public void setAddressForAutoQuote(String address){enterText(addressForAutoQuote,address);}
    public void setZipCodeForAutoQuote(String zipCode){enterText(zipCodeForAutoQuote,zipCode);}
    public void setDateOfBirthForAutoQuote(String dateOfBirth){enterText(dateOfBirthForAutoQuote,dateOfBirth);}
    public void setCityForAutoQuote(String city){enterText(cityForAutoQuote,city);}
    public void setNextForAutoQuote(){click(nextForAutoQuote);}


}
