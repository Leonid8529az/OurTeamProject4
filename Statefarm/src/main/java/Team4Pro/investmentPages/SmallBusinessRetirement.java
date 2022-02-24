package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmallBusinessRetirement extends OurAPI {
    public SmallBusinessRetirement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"nav-tab-17-3109868-2\"]")
    WebElement businessWithEmployee;
    @FindBy(xpath = "(//*[@title=\"Simplified Employee Pension\"])[1]")
    WebElement learMoreAboutSepIRA;

    public void setBusinessWithEmployee(){click(businessWithEmployee);}
    public void setLearMoreAboutSepIRA(){click(learMoreAboutSepIRA);}

}
