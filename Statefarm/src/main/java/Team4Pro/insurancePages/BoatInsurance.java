package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoatInsurance extends OurAPI {
    public  BoatInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"Boat Safety\"]")
            public
    WebElement stayingSafeInWater;

    public void setStayingSafeInWater(){click(stayingSafeInWater);}
}
