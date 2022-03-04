package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorcycleRatingPage extends OurAPI {
    public MotorcycleRatingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"vehicleMakeSelection\"]")
    WebElement make;

    @FindBy(xpath = "//*[@id=\"vehicleModelSelection\"]")
    WebElement model;

    @FindBy(xpath = "//*[@id=\"vehicleBodyStyleSelection\"]")
    WebElement type;

    @FindBy(xpath = "//*[@class=\"-oneX-btn-primary selectSubmit\"]")
    WebElement submitButton;


    public void setMake(String chooseMake){selectDropDownOption(make,chooseMake);}
    public void setModel(String chooseModel){selectDropDownOption(model,chooseModel);}
    public void setType(String chooseType){selectDropDownOption(type,chooseType);}
    public void setSubmitButton(){click(submitButton);}
}
