package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriveSafePage extends OurAPI {
    public DriveSafePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Mobile app tips')]")
    WebElement mobileAppTips;


    public void setMobileAppTips(){click(mobileAppTips);}
}
