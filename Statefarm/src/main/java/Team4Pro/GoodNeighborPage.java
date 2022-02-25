package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoodNeighborPage extends OurAPI {

    public GoodNeighborPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@id=\"button-24647\"])[1]")
    WebElement environment;

    public void setEnvironment(){click(environment);}


}
