package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffRoadInsurance extends OurAPI {
    public OffRoadInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"Camping Safety Tips to Set Up a Safe Campsite\"]")
            public
    WebElement tipsForCamping;

    public void setTipsForCamping(){click(tipsForCamping);}

}
