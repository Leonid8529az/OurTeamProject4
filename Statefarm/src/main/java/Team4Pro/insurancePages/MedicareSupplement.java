package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicareSupplement extends OurAPI {
    public MedicareSupplement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='-oneX-dropdown combo--input  ']")
    WebElement selectStateForMedicare;
    @FindBy(xpath = "//*[@class='-oneX-btn-primary comboBtn']")
    WebElement goForMedicare;
    public void setSelectStateForMedicare(String option){selectDropDownOption(selectStateForMedicare,option);}
    public void setGoForMedicare(){click(goForMedicare);}

}
