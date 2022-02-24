package Team4Pro.claimsPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExistingClaim extends OurAPI {
    public ExistingClaim(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public
    WebElement continueForExistingClaim;

    public void setContinueForExistingClaim(){click(continueForExistingClaim);}


}
