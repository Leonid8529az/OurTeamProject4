package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmergencyService extends OurAPI {
    public EmergencyService(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='start-request']")
    WebElement startRequestRoadSide;
    @FindBy(xpath = "//*[@id='loginalternative']")
    WebElement usePolicyForAssistance;
    @FindBy(xpath = "//*[@id='fname']")
    WebElement firstNameForAssistance;
    @FindBy(xpath = "//*[@id='lname']")
    WebElement lastNameForAssistance;
    @FindBy(xpath = "//*[@id='continueName']")
    WebElement continueForAssistance;
    @FindBy(xpath = "//*[@id='policyNum']")
    WebElement policyNumberForAssistance;
    public void setStartRequestRoadSide(){click(startRequestRoadSide);}
    public void setUsePolicyForAssistance(){click(usePolicyForAssistance);}
    public void setFirstNameForAssistance(String firstName){enterText(firstNameForAssistance,firstName);}
    public void setLastNameForAssistance(String lastName){enterText(lastNameForAssistance,lastName);}
    public void setContinueForAssistance(){click(continueForAssistance);}
    public void setPolicyNumberForAssistance(String number){enterText(policyNumberForAssistance,number);}


}
