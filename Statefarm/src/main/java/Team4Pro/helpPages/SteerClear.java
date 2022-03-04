package Team4Pro.helpPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SteerClear extends OurAPI {
    public SteerClear(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title=\"Safe Driver Training for Steer Clear®\"]")
            public
    WebElement startWithOnline;

    public void setStartWithOnline(){click(startWithOnline);}

}
