package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessInsuranceClaim extends OurAPI {
    public BusinessInsuranceClaim(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Contact your State Farm agent.')]")
    WebElement contactAgent;

    public void setContactAgent(){click(contactAgent);}
}
