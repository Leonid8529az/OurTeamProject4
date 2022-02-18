package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoofingMaterial extends OurAPI {
    public RoofingMaterial(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title='roofing-installation-info-and-certification']")
    public
    WebElement informationForRoofing;
    public void setInformationForRoofing(){click(informationForRoofing);}
}