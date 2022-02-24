package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EstimateYourInvestment extends OurAPI {
    public EstimateYourInvestment(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Contact a State Farm registered agent')]")
    public
    WebElement contactAgentForInvestment;

    public void setContactAgentForInvestment(){click(contactAgentForInvestment);}
}
