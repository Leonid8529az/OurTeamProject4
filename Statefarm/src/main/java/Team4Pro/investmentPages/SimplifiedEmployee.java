package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimplifiedEmployee extends OurAPI {
    public SimplifiedEmployee(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Owning a small business')]")
    public
    WebElement owningSmallBusiness;

    public void setOwningSmallBusiness(){click(owningSmallBusiness);}

}
