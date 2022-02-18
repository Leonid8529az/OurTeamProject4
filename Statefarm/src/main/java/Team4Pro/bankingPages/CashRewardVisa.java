package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashRewardVisa extends OurAPI {
    public CashRewardVisa (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@class='usballiance-primarybtnanchor applyNow'])[1]")
    WebElement applyForCashRewardVisa;

    public void setApplyForCashRewardVisa(){click(applyForCashRewardVisa);}


}
