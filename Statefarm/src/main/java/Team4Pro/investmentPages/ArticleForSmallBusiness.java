package Team4Pro.investmentPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleForSmallBusiness extends OurAPI {
    public ArticleForSmallBusiness(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'View business financial tips')]")
    public
    WebElement viewBusinessTips;
    public void setViewBusinessTips(){click(viewBusinessTips);}
}
