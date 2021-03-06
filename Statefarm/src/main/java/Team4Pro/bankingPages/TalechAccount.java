package Team4Pro.bankingPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalechAccount extends OurAPI {
    public TalechAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class='usb--button usb--button--primary usb--button--default '] ")
    public
    WebElement continueForTalechAccount;

    public void setContinueForTalechAccount(){click(continueForTalechAccount);}
}
