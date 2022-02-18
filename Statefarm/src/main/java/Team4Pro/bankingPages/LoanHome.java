package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanHome extends OurAPI {


    public LoanHome (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[text()='Home Loans']")
    WebElement bankingSubTitle_HomeLoan;
    @FindBy(xpath = "//*[@id='callout-agent-zip-code-input1']")
    public
    WebElement zipCodeForHomeLoan;
    @FindBy(xpath = "//*[@id='quote-main-zip-code-button1']")
    WebElement findAgentButton;

    public void setBankingSubTitle_HomeLoan(){click(bankingSubTitle_HomeLoan);}
    public void setZipCodeForHomeLoan(String zipCode){enterText(zipCodeForHomeLoan,zipCode);}
    public void setFindAgentButton(){click(findAgentButton);}



}
