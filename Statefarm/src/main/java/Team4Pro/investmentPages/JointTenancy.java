package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JointTenancy extends OurAPI {
    public JointTenancy(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title='Mutual Funds and Investment Goals - State Farm']")
    public
    WebElement mutualFunds;

    public void setMutualFunds(){click(mutualFunds);}

}
