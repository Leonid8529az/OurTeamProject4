package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PetInsurance extends OurAPI {
    public PetInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"Dog Insurance – Get a free dog insurance quote\"]")
            public
    WebElement dogInsurance;

    @FindBy(xpath = "//*[@title=\"Cat Insurance – Get a free cat insurance quote\"]")
            public
    WebElement catInsurance;

    public void setDogInsurance(){click(dogInsurance);}
    public void setCatInsurance(){click(catInsurance);}

}
