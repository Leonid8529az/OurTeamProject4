package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetRoadSideAssistance extends OurAPI {
    public GetRoadSideAssistance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='-oneX-btn-primary__anchor -oneX-btn-medium']")
    WebElement getAssistance;
    public void setGetAssistance(){click(getAssistance);}

}
