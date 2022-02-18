package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankingMadeSimpleUSBank extends OurAPI {


    public BankingMadeSimpleUSBank(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//*[@class='usballiance-primarybtnanchor applyNow']")
    WebElement applyNowForBasicChecking;

    public void setApplyNowForBasicChecking(){click(applyNowForBasicChecking);}
}
