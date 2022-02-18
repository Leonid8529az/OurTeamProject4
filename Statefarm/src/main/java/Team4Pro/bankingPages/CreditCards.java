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


    @FindBy(xpath = "//body/div[@id='content']/section[@id='cc-masthead']/div[1]/div[1]/div[3]/p[2]/span[1]/a[1]")
    public
    WebElement learnMoreAboutCashRewardVisa;
    @FindBy(xpath = "//h2[@id='neighbor']")
            public
    WebElement neighborVisaCard;

    public void setLearnMoreAboutCashRewardVisa(){click(learnMoreAboutCashRewardVisa);}
    public void setNeighborVisaCard(){}




}