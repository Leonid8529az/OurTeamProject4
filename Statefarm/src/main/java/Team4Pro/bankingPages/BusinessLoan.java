package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessLoan extends OurAPI {

    public BusinessLoan (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[text()='Apply for an Equipment Quick Loan']")
    public
    WebElement applyForEquipmentLoan;

    public void setApplyForEquipmentLoan(){click(applyForEquipmentLoan);}
}
