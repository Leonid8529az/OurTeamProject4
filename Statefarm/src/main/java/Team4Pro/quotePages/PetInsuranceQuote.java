package Team4Pro.quotePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetInsuranceQuote extends OurAPI {
    public PetInsuranceQuote(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"sfx_firstName_input\"]")
    WebElement firstNameForPetQuote;
    @FindBy(xpath = "//*[@id=\"sfx_lastName_input\"]")
    WebElement lastNameForPetQuote;
    @FindBy(xpath = "//*[@id=\"sfx_userAddress.streetAddress_input\"]")
    WebElement addressForPetQuote;
    @FindBy(xpath = "//*[@id=\"sfx_userAddress.zipCode_input\"]")
    WebElement zipCodeForPetQuote;
    @FindBy(xpath = "//*[@id=\"sfx_userAddress.city_input\"]")
    WebElement cityForPetQuote;
    @FindBy(xpath = "//*[@id=\"welcome.continue\"]")
    public
    WebElement continueButtonForPetQuote;

    public void setFirstNameForPetQuote(String firstName){enterText(firstNameForPetQuote,firstName);}
    public void setLastNameForPetQuote(String lastName){enterText(lastNameForPetQuote,lastName);}
    public void setAddressForPetQuote(String address){enterText(addressForPetQuote,address);}
    public void setZipCodeForPetQuote(String zipCode){enterText(zipCodeForPetQuote,zipCode);}
    public void setCityForPetQuote(String city){enterText(cityForPetQuote,city);}
    public void setContinueButtonForPetQuote(){click(continueButtonForPetQuote);}

}
