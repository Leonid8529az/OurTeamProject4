package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermLifeInsurance extends OurAPI {
    public TermLifeInsurance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='quote-main-state-select2']")
    public
    WebElement selectStateForTermLife;
    @FindBy(xpath = "//*[@class='-oneX-btn-fit-content -oneX-btn-primary'and text()='Go']")
    WebElement goForTermLife;
    public void setSelectStateForTermLife(String state){selectDropDownOption(selectStateForTermLife,state);}
    public void setGoForTermLife(){click(goForTermLife);}

}
