package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleInsightPage extends OurAPI {
    public SimpleInsightPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Collection of Articles to Help Drive in Bad Weathe')]")
    WebElement badWeatherDriving;

    public void setBadWeatherDriving(){click(badWeatherDriving);}
}
