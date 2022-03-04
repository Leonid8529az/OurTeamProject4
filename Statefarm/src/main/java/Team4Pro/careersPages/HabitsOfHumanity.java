package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HabitsOfHumanity extends OurAPI {
    public HabitsOfHumanity(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "")
    WebElement learAboutOurWork;

    public void setLearAboutOurWork(){click(learAboutOurWork);}
}
