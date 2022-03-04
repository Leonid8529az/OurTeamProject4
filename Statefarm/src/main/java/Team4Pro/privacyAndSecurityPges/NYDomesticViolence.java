package Team4Pro.privacyAndSecurityPges;

import base.OurAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NYDomesticViolence extends OurAPI {
    public NYDomesticViolence(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Confidential Communication Request Form']")
    public WebElement requestForm;

    public void setRequestForm(){click(requestForm);}


}
