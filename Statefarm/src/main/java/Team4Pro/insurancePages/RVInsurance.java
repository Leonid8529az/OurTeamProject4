package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RVInsurance extends OurAPI {

    public RVInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"Travel and Camping Trailer Insurance Quote\"]")
            public
    WebElement campingTrailer;

    public void setCampingTrailer(){click(campingTrailer);}
}
