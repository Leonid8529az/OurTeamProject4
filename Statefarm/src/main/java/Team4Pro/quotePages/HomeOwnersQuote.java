package Team4Pro.quotePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomeOwnersQuote extends OurAPI {
    public HomeOwnersQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    WebElement firstNameForHomeQuote;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    WebElement lastNameForHomeQuote;
    @FindBy(xpath = "//*[@id=\"nameSuffix\"]")
    WebElement suffixForHomeQuote;
    @FindBy(xpath = "//*[@id=\"street\"]")
    WebElement addressForHomeQuote;
    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement cityForHomeQuote;
    @FindBy(xpath = "//*[@id=\"zipCode\"]")
    WebElement zipCodeForHomeQuote;
    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]")
    WebElement dateOfBirthForHomeQuote;
    @FindBy(xpath = "//*[@id=\"sameAsRiskAddress\"]")
    public
    WebElement sameAsAboveForHomeQuote;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    public
    WebElement continueForHomeQuote;


    public void setFirstNameForHomeQuote(String firstName){enterText(firstNameForHomeQuote,firstName);}
    public void setLastNameForHomeQuote(String lastName){enterText(lastNameForHomeQuote,lastName);}
    public void setSuffixForHomeQuote(String suffix){selectDropDownOption(suffixForHomeQuote,suffix);}
    public void setAddressForHomeQuote(String address){enterText(addressForHomeQuote,address);}
    public void setCityForHomeQuote(String city){enterText(cityForHomeQuote,city);}
    public void setZipCodeForHomeQuote(String zipCode){enterText(zipCodeForHomeQuote,zipCode);}
    public void setDateOfBirthForHomeQuote(String dateOfBirth){enterText(dateOfBirthForHomeQuote,dateOfBirth);}
    public void setSameAsAboveForHomeQuote(){click(sameAsAboveForHomeQuote);}
    public void setContinueForHomeQuote(){click(continueForHomeQuote);}

}
