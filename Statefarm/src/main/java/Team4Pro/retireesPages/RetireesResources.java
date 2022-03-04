package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetireesResources extends OurAPI {

    public RetireesResources(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'How much will social security provide?')]")
            public
    WebElement socialSecurityProvide;

    public void setSocialSecurityProvide(){click(socialSecurityProvide);}
}
