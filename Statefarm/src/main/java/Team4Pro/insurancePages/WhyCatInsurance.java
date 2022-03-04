package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhyCatInsurance extends OurAPI {
    public WhyCatInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@title=\"Why Should You Consider Pet Medical Insurance\"]")
    WebElement kittensHealth;

    public void setKittensHealth(){click(kittensHealth);}
}
