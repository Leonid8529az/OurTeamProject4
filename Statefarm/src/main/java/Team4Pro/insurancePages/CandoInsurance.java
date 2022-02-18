package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandoInsurance extends OurAPI {
    public CandoInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-input\"]")
    WebElement zipCodeForCando;
    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-button-1\"]")
    WebElement starQuoteForCando;

    public void setZipCodeForCando(String zipCode){enterText(zipCodeForCando,zipCode);}
    public void setStarQuoteForCando(){click(starQuoteForCando);}
}
