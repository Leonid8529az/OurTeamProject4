package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmericanFunds extends OurAPI {
    public AmericanFunds(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[@class='-oneX-link--block external-link-icon footNoteStyles -oneX-link--inline'])[1]")
    WebElement amcapFunds;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3054846-1\"]")
    WebElement USEquityFund;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3054846-2\"]")
    WebElement portfolioFunds;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3054846-3\"]")
    WebElement targetFunds;

    @FindBy(xpath = "//*[@id=\"nav-tab-17-3054846-4\"]")
    WebElement moneyMarketFund;

    @FindBy(xpath = "//*[text()=\"The Bond Fund of America\"]")
            public
    WebElement theBondFundOfAmerica;

    public void setAmcapFunds(){click(amcapFunds);}
    public void setUSEquityFund(){click(USEquityFund);}
    public void setPortfolioFunds(){click(portfolioFunds);}
    public void setTargetFunds(){click(targetFunds);}
    public void setMoneyMarketFund(){click(moneyMarketFund);}
    public void setTheBondFundOfAmerica(){click(theBondFundOfAmerica);}

}
