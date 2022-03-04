package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InnovationPage extends OurAPI {

    public InnovationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Visit our Ventures Office']")
    WebElement visitOurVenture;

    public void setVisitOurVenture(){click(visitOurVenture);}
}
