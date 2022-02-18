package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WinterWeather extends OurAPI {
    public WinterWeather(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id=\"navbarDropdown4\"]")
    WebElement smartIdeas;

    public void setSmartIdeas(String option){selectDropDownOption(smartIdeas,option);}

}
