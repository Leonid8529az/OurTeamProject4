package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeAllianceBank extends OurAPI {

    public WelcomeAllianceBank(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "(//*[@class='-oneX-btn-secondary'])[3]")

    WebElement continueAsGuest;

    @FindBy(xpath = "//*[@id='block-link']")
    WebElement applyWithAgent;

    public void setContinueAsGuest(){click(continueAsGuest);}
    public void setApplyWithAgent(){click(applyWithAgent);}
}
