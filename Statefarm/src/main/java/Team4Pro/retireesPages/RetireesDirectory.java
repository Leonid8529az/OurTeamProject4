package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetireesDirectory extends OurAPI {
    public RetireesDirectory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@title='External link: State Farm Alumni Marketplace']")
            public
    WebElement usDiscountLInk;

    public void setUsDiscountLInk(){click(usDiscountLInk);}
}
