package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.ref.WeakReference;

public class CDsPage extends OurAPI {
    public CDsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[text()='Learn more about Retirement CDs']")
    public
    WebElement learnMoreBoutRetirementCDS;
    @FindBy(xpath = "//*[@id='thirdPartyLinkModal-continue2']")
    WebElement continueButtonForCds;
    @FindBy(xpath = "//a[contains(text(),'Learn more about CD Specials')]")
    public
    WebElement leanMoreAboutCDSSpecial;
    @FindBy(xpath = "//a[contains(text(),'Learn more about Trade Up CDs')]")
    public
    WebElement learMoreAboutTradeUp;


    public void setLearnMoreBoutRetirementCDS(){click(learnMoreBoutRetirementCDS);}
    public void setContinueButtonForCds(){click(continueButtonForCds);}
    public void setLeanMoreAboutCDSSpecial(){click(leanMoreAboutCDSSpecial);}
    public void setLearMoreAboutTradeUp(){click(learMoreAboutTradeUp);}

}
