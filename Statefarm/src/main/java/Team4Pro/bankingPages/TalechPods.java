package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalechPods extends OurAPI {
    public TalechPods (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id='input_checkbox_Over-the-phone']")
    public
    WebElement overThePhone;
    public void setOverThePhone(){click(overThePhone);}
}
