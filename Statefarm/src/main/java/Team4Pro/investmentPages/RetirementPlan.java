package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetirementPlan extends OurAPI {
    public RetirementPlan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class='content-panel-link -oneX-link--block  '])[3]")
    WebElement optimizeYourAssets;

    public void setOptimizeYourAssets(){click(optimizeYourAssets);}


}
