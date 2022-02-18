package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public void setLearnMoreBoutRetirementCDS(){click(learnMoreBoutRetirementCDS);}
    public void setContinueButtonForCds(){click(continueButtonForCds);}

}
