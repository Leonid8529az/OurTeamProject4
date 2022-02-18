package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloodInsurance extends OurAPI {

    public FloodInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Ice Dams, Snow on Your Roof, and Attic Condensatio')]")
    public
    WebElement iceDams;
    public void setIceDams(){click(iceDams);}
}
