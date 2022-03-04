package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorcycleInsurance extends OurAPI {
    public MotorcycleInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title=\"Motorcycle Insurance Ratings\"]")
            public
    WebElement ratingTool;

    public void setRatingTool(){click(ratingTool);}
}
