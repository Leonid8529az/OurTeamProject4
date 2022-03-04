package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravelAndCamping extends OurAPI {
    public TravelAndCamping(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"What to Know Before Buying an RV\"]")
    public
    WebElement beforeBuyingRV;

    public void setBeforeBuyingRV(){click(beforeBuyingRV);}
}
