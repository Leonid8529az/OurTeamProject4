package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoSafety extends OurAPI {
    public AutoSafety(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()=\"Learn more about IIHS\"]")
    WebElement learnAboutIIHS;

    public void setLearnAboutIIHS(){click(learnAboutIIHS);}
}
