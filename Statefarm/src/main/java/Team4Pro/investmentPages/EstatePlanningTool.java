package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EstatePlanningTool extends OurAPI {
    public EstatePlanningTool(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Testamentary Trusts')]")
    public
    WebElement testamentaryTrust;
    public void setTestamentaryTrust(){click(testamentaryTrust);}
}
