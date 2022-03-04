package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FarmOrRanch extends OurAPI {
    public FarmOrRanch(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"callout-agent-zip-code-input1\"]")
    WebElement zipCodeForAgent;

    public void setZipCodeForAgent(String code){enterText(zipCodeForAgent,code);}
}
