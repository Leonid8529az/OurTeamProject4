package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowToAvoidHacker extends OurAPI {
    public HowToAvoidHacker(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@title=\"Identity Restoration and Fraud Loss Coverage\"]")
            public
    WebElement identityRestoration;

    public void setIdentityRestoration(){click(identityRestoration);}
}
