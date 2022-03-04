package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticleToHelp extends OurAPI {
    public ArticleToHelp(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'View all retirement planning tips')]")
            public
    WebElement planningTips;


    public void setPlanningTips(){click(planningTips);}

}
