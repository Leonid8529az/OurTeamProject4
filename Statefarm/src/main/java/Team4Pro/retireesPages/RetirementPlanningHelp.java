package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetirementPlanningHelp extends OurAPI {

    public RetirementPlanningHelp(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Questions About Social Security Survivor Benefits')]")
    WebElement survivorBenefits;

    public void setSurvivorBenefits(){click(survivorBenefits);}
}
