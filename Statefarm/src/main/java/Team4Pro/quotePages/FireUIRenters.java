package Team4Pro.quotePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FireUIRenters extends OurAPI {
    public FireUIRenters(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"insured-address-address_line1-id\"]")
    public
    WebElement addressForRenterQuote;
    @FindBy(xpath = "//*[@id=\"insured-address-city-id\"]")
    WebElement cityForRenterQuote;
    @FindBy(xpath = "//*[@id=\"insured-address-state-id\"]")
    WebElement stateForRenterQuote;
    @FindBy(xpath = "//*[@id=\"insured-address-zip-id\"]")
    WebElement zipCodeForRenterQuote;
    @FindBy(xpath = "//*[@type=\"continue\"]")
    WebElement continueButtonForRenterQuote;



    public void setAddressForRenterQuote(String address){enterText(addressForRenterQuote,address);}
    public void setCityForRenterQuote(String city){enterText(cityForRenterQuote,city);}
    public void setStateForRenterQuote(String state){selectDropDownOption(stateForRenterQuote,state);}
    public void setZipCodeForRenterQuote(String zipCode){enterText(zipCodeForRenterQuote,zipCode);}
    public void setContinueButtonForRenterQuote(){click(continueButtonForRenterQuote);}
}
