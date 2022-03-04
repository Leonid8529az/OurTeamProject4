package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaferCommunity extends OurAPI {
    public SaferCommunity(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()=\"Learn more about auto safety\"]")
    public
    WebElement autoSafety;

    public void setAutoSafety(){click(autoSafety);}
}
