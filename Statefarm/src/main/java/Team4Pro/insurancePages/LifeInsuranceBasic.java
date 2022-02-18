package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeInsuranceBasic extends OurAPI {
    public LifeInsuranceBasic(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Get started']")
    public
    WebElement getStartedForLifeInsurance;

    public void setGetStartedForLifeInsurance(){click(getStartedForLifeInsurance);}

}
