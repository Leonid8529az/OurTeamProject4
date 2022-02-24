package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MutualFunds extends OurAPI {
    public MutualFunds(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title='Retrieve your account information']")
    public
    WebElement troubleLogging;
    public void setTroubleLogging(){click(troubleLogging);}

}
