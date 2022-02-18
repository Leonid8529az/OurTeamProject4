package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessLiability extends OurAPI {
    public BusinessLiability(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Flood insurance for your business')]")
    public
    WebElement floodInsurance;

    public void setFloodInsurance(){click(floodInsurance);}


}
