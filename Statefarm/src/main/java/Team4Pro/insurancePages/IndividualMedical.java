package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualMedical extends OurAPI {
    public IndividualMedical(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"sState\"]")
    WebElement state;
    @FindBy(xpath = "//*[@id=\"sState_button\"]")
    WebElement goButton;

    public void setState(String yourStare){selectDropDownOption(state,yourStare);}
    public void setGoButton(){click(goButton);}

}
