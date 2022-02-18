package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WholeLifeInsurance extends OurAPI {
    public WholeLifeInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@title='Life Insurance Basics']")
    WebElement lifeInsuranceResources;
    @FindBy(xpath = "//*[text()='Want to know more about life insurance?']")
    public
    WebElement whatToKnow;

    public void setLifeInsuranceResources(){click(lifeInsuranceResources);}
    public void setWhatToKnow(){}
}
