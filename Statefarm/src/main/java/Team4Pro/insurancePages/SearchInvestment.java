package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchInvestment extends OurAPI {
    public SearchInvestment(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()=\"Periodic Investment Plans - State Farm®\"]")
            public
    WebElement periodicInvestment;

    public void setPeriodicInvestment(){click(periodicInvestment);}
}
