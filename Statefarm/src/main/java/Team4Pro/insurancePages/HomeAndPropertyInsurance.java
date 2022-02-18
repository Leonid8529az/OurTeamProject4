package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PropertyInsurance extends OurAPI {
    public PropertyInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    
}
