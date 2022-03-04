package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFarmSecurity extends OurAPI {
    public StateFarmSecurity(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[text()='How to protect yourself'])[1]")
    WebElement howToProtect;

    @FindBy(xpath = "(//*[@class=\"-oneX-panel__chevron-down\"])[7]")
            public
    WebElement managePassword;

    @FindBy(xpath = "//*[@title=\"How to Avoid Your Account Getting Hacked\"]")
    WebElement howToAvoidHacking;




    public void setHowToProtect(){click(howToProtect);}
    public void setManagePassword(){click(managePassword);}
    public void setHowToAvoidHacking(){click(howToAvoidHacking);}
}
