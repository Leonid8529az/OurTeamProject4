package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContractorInsurance extends OurAPI {
    public ContractorInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = " //*[text()=' Have an agent contact me']")
    WebElement agentContactMe;

    public void setAgentContactMe(){click(agentContactMe);}
}
