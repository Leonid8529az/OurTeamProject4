package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SafeDriver extends OurAPI {
    public SafeDriver(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[@title=\"Auto Insurance Discounts\"])[1]")
            public
    WebElement insuranceDiscount;

    public void setInsuranceDiscount(){click(insuranceDiscount);}
}
