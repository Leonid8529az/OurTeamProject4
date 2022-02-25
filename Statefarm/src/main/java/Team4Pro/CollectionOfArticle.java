package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionOfArticle extends OurAPI {
    public CollectionOfArticle(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Tips for Driving Safely in the Rain')]")
    WebElement drivingInTheRain;

    public void setDrivingInTheRain(){click(drivingInTheRain);}

}
