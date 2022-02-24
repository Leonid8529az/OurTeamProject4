package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FederalEstate extends OurAPI {
    public FederalEstate(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'estate planning tools')]")
    public
    WebElement estatePlanningTool;

    public void setEstatePlanningTool(){click(estatePlanningTool);}

}
