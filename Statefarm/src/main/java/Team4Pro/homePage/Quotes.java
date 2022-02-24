package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quotes extends OurAPI {
    public Quotes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'Get a Quote')]")
    WebElement getAQuoteInHomePage;
    @FindBy(xpath = "//*[@id=\"getaquote-select-product\"]")
    WebElement selectProductForQuote;
    @FindBy(xpath = "//*[@id=\"getaquote-zip\"]")
    WebElement zipCodeForQuote;
    @FindBy(xpath = "//*[@id=\"getaQuoteButton\"]")
    WebElement startQuoteButton;
    @FindBy(xpath = "//*[@id=\"getaquote-state-select\"]")
    WebElement stateForQuote;

    public void setGetAQuoteInHomePage(){click(getAQuoteInHomePage);}
    public void setSelectProductForQuote(String product){selectDropDownOption(selectProductForQuote,product);}
    public void setZipCodeForQuote(String zipcode){enterText(zipCodeForQuote,zipcode);}
    public void setStartQuoteButton(){click(startQuoteButton);}
    public void setStateForQuote(String state){selectDropDownOption(stateForQuote,state);}
}