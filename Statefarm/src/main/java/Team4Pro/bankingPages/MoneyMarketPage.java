package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoneyMarketPage extends OurAPI {
    public MoneyMarketPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='content']/section[@id='deposits-options']/div[1]/div[1]/div[2]/div[1]/div[9]/p[2]/a[1]")
    public
    WebElement applyForPlatinumBusinessPackage;

    public void setApplyForPlatinumBusinessPackage(){click(applyForPlatinumBusinessPackage);}
}
