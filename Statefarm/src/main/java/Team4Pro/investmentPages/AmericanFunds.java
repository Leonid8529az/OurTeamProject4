package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmericanFunds extends OurAPI {
    public AmericanFunds(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[@class='-oneX-link--block external-link-icon footNoteStyles -oneX-link--inline'])[1]")
    WebElement amcapFunds;

    public void setAmcapFunds(){click(amcapFunds);}
}
