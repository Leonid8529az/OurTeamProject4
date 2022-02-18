package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeforeStartLoan extends OurAPI {
    public BeforeStartLoan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@class='usb--button usb--button--primary usb--button--default ']")
    WebElement getStartedForLoan;

    public void setGetStartedForLoan(){click(getStartedForLoan);}
}
