package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineCheckingPage extends OurAPI {


    public OnlineCheckingPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//*[text()='Learn more about Easy Checking Accounts']")
    public
    WebElement learnAboutEasyChecking;
    @FindBy(xpath = "//*[@id='thirdPartyLinkModal-continue']")
    WebElement continueButton;

    @FindBy(xpath = "(//*[text()='Apply with U.S. Bank'])[2]")
    public
    WebElement applyNoeForGold;


    public void setLearnAboutEasyChecking(){click(learnAboutEasyChecking);}
    public void setContinueButton(){click(continueButton);}
    public void setApplyNoeForGold (){click(applyNoeForGold);}

}
