package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatInsurance extends OurAPI {
    public CatInsurance(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"Why Your Cat Needs Health Insurance\"]")
            public
    WebElement whyCatInsurance;

    public void setWhyCatInsurance(){click(whyCatInsurance);}

}
