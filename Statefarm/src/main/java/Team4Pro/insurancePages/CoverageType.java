package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverageType extends OurAPI {

    public CoverageType(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title=\"The Benefits of Emergency Road Service Coverage\"]")
    public WebElement emergencyRoadService;

    public void setEmergencyRoadService(){click(emergencyRoadService);}

}
