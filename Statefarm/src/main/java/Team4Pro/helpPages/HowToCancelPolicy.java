package Team4Pro.helpPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowToCancelPolicy extends OurAPI {
    public HowToCancelPolicy(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[text()='Cancel by mail'])[1]")
            public
    WebElement cancelByMail;

    @FindBy(xpath = "(//*[text()='Cancel by mail'])[1]")
    WebElement cancelInPerson;

    public void setCancelByMail(){click(cancelByMail);}
    public void setCancelInPerson(){click(cancelInPerson);}
}
