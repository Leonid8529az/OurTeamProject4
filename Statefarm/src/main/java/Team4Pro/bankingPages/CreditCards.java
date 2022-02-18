package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditCards extends OurAPI {
    public CreditCards(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "(//*[@class='-oneX-btn-secondary__anchor -oneX-btn-fit-content'])[1]")
    public
    WebElement learnMoreAboutCashRewardVisa;

    public void setLearnMoreAboutCashRewardVisa(){click(learnMoreAboutCashRewardVisa);}




}