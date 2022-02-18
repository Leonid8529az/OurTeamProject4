package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAndPropertyInsurance extends OurAPI {
    public HomeAndPropertyInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[text()='Unlock more on homeowners insurance']")
    public
    WebElement unlockMoreForHomeOwners;
    public void setUnlockMoreForHomeOwners(){click(unlockMoreForHomeOwners);}


}
