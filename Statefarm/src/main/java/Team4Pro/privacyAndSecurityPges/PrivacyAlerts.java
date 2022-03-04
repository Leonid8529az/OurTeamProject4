package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PrivacyAlerts extends OurAPI {
    public PrivacyAlerts(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@class=\"-oneX-icon--chevron--down\"]")
    WebElement suspiciousEmails;
    @FindBy(xpath = "//*[@class=\"-oneX-link--inline external-link-icon\"]")
            public
    WebElement federalTrade;

    public void setSuspiciousEmails(){click(suspiciousEmails);}
    public void setFederalTrade(){click(federalTrade);}
}
