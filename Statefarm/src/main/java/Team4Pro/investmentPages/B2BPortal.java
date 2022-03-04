package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class B2BPortal extends OurAPI {
    public B2BPortal(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "(//*[@title=\"Link - Register\"])[3]")
    WebElement register;

    public void setRegister(){click(register);}
}
