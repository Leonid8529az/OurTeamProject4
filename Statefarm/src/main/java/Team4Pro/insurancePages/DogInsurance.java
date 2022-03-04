package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DogInsurance extends OurAPI {
    public DogInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-input-1\"]")
    WebElement zipCodeForDogQuote;
    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-button-1\"]")
    WebElement startDogQuote;

    public  void setZipCodeForDogQuote(String zipcode){enterText(zipCodeForDogQuote,zipcode);}
    public void setStartDogQuote(){click(startDogQuote);}
}
