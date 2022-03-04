package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PesonalArticle extends OurAPI {
    public  PesonalArticle(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[text()='Talk to a local State Farm Agent']")
            public
    WebElement talkToAnAgent;

    public void setTalkToAnAgent(){click(talkToAnAgent);}
}
