package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturedHome extends OurAPI {
    public ManufacturedHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"callout-agent-zip-code-input_1\"]")
    WebElement zipCodeForManufacturedHome;
    @FindBy(xpath = "//*[@id=\"quote-main-zip-code-button_1\"]")
    WebElement findAgentForManufacturedHome;

    public void setZipCodeForManufacturedHome(String zipCode){enterText(zipCodeForManufacturedHome,zipCode);}
    public void setFindAgentForManufacturedHome(){click(findAgentForManufacturedHome);}

}
