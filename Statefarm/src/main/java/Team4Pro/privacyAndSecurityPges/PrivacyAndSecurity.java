package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PrivacyAndSecurity extends OurAPI {
    public PrivacyAndSecurity(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[text()='Privacy'])[1]")
            public
    WebElement privacy;
    @FindBy(xpath = "(//*[text()='Security'])[1]")
            public
    WebElement security;
    @FindBy(xpath = "(//*[text()='Alerts'])[1]")
            public
    WebElement alerts;

    @FindBy(xpath = "//*[text()='California Consumers with prior State Farm employment - Request Form']")
    public
    WebElement requestForm;

    @FindBy(xpath = "//*[@title=\"Notice of Privacy Policy\"]")
    WebElement fullPrivacyPolicy;

//    @FindBy(xpath = "(//*[text()='Privacy'])[1]")
//    WebElement ;
//    @FindBy(xpath = "(//*[text()='Privacy'])[1]")
//    WebElement privacy;

    public void setPrivacy(){click(privacy);}
    public void setSecurity(){click(security);}
    public void setAlerts(){click(alerts);}
    public void setRequestForm(){click(requestForm);}
    public void setFullPrivacyPolicy(){click(fullPrivacyPolicy);}

}
