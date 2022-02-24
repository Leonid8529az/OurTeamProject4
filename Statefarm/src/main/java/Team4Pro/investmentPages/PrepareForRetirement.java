package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrepareForRetirement extends OurAPI {
    public PrepareForRetirement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@title ='Profile - Personal Information']")
    public
    WebElement calculateMyRetirement;

    public void setCalculateMyRetirement(){click(calculateMyRetirement);}

}
