package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LossControl extends OurAPI {

    public LossControl(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@class=\"-oneX-link--inline external-link-icon\"and text()='Aggressive Driving']")
    public
    WebElement aggressiveDriving;
    @FindBy(xpath = "(//*[text()='Other available resources'])[1]")
    public
    WebElement otherAvailableResource;

    public void setAggressiveDriving(){click(aggressiveDriving);}
    public void setOtherAvailableResource(){}
}
