package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessibilityStatementPage extends OurAPI {
    public AccessibilityStatementPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"Accessibility Feedback Form\"]")
    WebElement accessibilityFeedback;

    public void setAccessibilityFeedback(){click(accessibilityFeedback);}
}
