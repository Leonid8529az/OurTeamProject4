package Team4Pro.otherPages;

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



    @FindBy(xpath = "//a[contains(text(),'Learn more about Easy Checking Accounts')]")
    public
    WebElement learnAboutEasyChecking;
    @FindBy(xpath = "//*[@id='thirdPartyLinkModal-continue']")
    WebElement continueButton;


    public void setLearnAboutEasyChecking(){click(learnAboutEasyChecking);}
    public void setContinueButton(){click(continueButton);}

}
