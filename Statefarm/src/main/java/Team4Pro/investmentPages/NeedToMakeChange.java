package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeedToMakeChange extends OurAPI {
    public NeedToMakeChange(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title ='Life Insurance for All that Matters to You']")
    WebElement lifeInsurance;
    public void setLifeInsurance(){click(lifeInsurance);}

}
