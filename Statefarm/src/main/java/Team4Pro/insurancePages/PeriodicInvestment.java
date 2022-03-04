package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PeriodicInvestment extends OurAPI {

    public PeriodicInvestment(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title=\"Future Value Retirement Savings Calculator\"]")
            public
    WebElement howMuchSavingBeWorth;


    public void setHowMuchSavingBeWorth(){click(howMuchSavingBeWorth);}
}
