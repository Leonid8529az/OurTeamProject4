package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOwner extends OurAPI {
    public HomeOwner(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[text()='Explore homeowners insurance discounts']")
    public
    WebElement exploreHomeOwners;
    public void setExploreHomeOwners(){click(exploreHomeOwners);}
}
