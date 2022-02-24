package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LifeInsurance extends OurAPI {
    public LifeInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"quote-main-state-select\"]")
    WebElement stateForTermLifeInsurance;
    @FindBy(xpath = "//body/div[@id='content']/section[@id='life-masthead']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/button[1]")
    WebElement goForLifeInsurance;

    public void setStateForTermLifeInsurance(String state){selectDropDownOption(stateForTermLifeInsurance,state);}
    public void setGoForLifeInsurance(){click(goForLifeInsurance);}
}
