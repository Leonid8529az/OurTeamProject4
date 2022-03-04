package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careers extends OurAPI {
    public Careers(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='opt-careerslink']")
            public
    WebElement careersAtStateFarm;
    @FindBy(xpath = "//*[@id='opt-diversity']")
            public
    WebElement diversityAndInclusion;
    public
    @FindBy(xpath = "//*[@id='opt-retiree']")
    WebElement retirees;


    public void setCareersAtStateFarm(){click(careersAtStateFarm);}
    public void setDiversityAndInclusion(){click(diversityAndInclusion);}
    public void setRetirees(){click(retirees);}
}
