package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RothIRA extends OurAPI {
    public RothIRA(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@title=\"Traditional vs. Roth IRA Calculator\"]")
    WebElement comparingRothIRAs;
    public void setComparingRothIRAs(){click(comparingRothIRAs);}
}
