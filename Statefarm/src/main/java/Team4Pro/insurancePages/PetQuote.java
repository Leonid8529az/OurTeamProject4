package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetQuote extends OurAPI {
    public PetQuote(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"sfx_firstName_input\"]")
    WebElement firstName;

    @FindBy(xpath = "//*[@id=\"sfx_lastName_input\"]")
    WebElement lastName;

    @FindBy(xpath = "//*[@id=\"sfx_userAddress.streetAddress_input\"]")
    WebElement streetAddress;

    @FindBy(xpath = "//*[@id=\"sfx_userAddress.apartmentOrUnitNumber_input\"]")
    WebElement apartment;

    @FindBy(xpath = "//*[@id=\"sfx_userAddress.zipCode_input\"]")
    WebElement zipcode;

    @FindBy(xpath = "//*[@id=\"sfx_userAddress.city_input\"]")
            public
    WebElement city;

    @FindBy(xpath = "//*[@id=\"welcome.continue\"]")
    WebElement continueForQuote;

    public void setFirstName(String name){enterText(firstName,name);}
    public void setLastName(String name){enterText(lastName,name);}
    public void setStreetAddress(String address){enterText(streetAddress,address);}
    public void setApartment(String apt){enterText(apartment,apt);}
    public void setZipcode(String code){enterText(zipcode,code);}
    public void setCity(String yourCity){enterText(city,yourCity);}
    public void setContinueForQuote(){click(continueForQuote);}
}
