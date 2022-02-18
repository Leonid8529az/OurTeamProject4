package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOwnerDiscount extends OurAPI {
    public HomeOwnerDiscount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='See roofing material discounts']")
    public
    WebElement seeRoofingDiscount;
    public void setSeeRoofingDiscount(){click(seeRoofingDiscount);}

}
