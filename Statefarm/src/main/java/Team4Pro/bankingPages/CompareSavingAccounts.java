package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareSavingAccounts extends OurAPI {


    public CompareSavingAccounts (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "(//*[@class='product-dropdown-icon'])[4]")
    WebElement selectFromStandardSaving;
    @FindBy(xpath = "(//*[@class='usballiance-primarybtnanchor applyNow'])[1]")
    WebElement applyNowForSaving;

    public void setSelectFromStandardSaving(String option){selectDropDownOption(selectFromStandardSaving,option);}
    public void setApplyNowForSaving(){click(applyNowForSaving);}
}
