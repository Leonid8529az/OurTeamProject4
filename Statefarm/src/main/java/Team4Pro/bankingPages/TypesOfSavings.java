package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypesOfSavings extends OurAPI {

    public TypesOfSavings(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@class='-oneX-btn-primary__anchor']")
    WebElement compareSavingAccounts;
    @FindBy(xpath = "//*[@id='thirdPartyLinkModal-continue']")
    WebElement continueButton;


    public void setCompareSavingAccounts(){click(compareSavingAccounts);}
    public void setContinueButton(){click(continueButton);}
}
