package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginGeneralData extends OurAPI {
    public LoginGeneralData(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailForJob;
    @FindBy(xpath = "//*[@id=\"accept_gdpr\"]")
            public
    WebElement acceptCondition;
    @FindBy(xpath = "//*[@id=\"enterEmailSubmitButton\"]")
    WebElement nextForJob;
    @FindBy(xpath ="//*[@id=\"icims_content_iframe\"]")
            public
    WebElement frame;


    public void setEmailForJob(String email){enterText(emailForJob,email);}
    public void setAcceptCondition(){click(acceptCondition);}
    public void setNextForJob(){click(nextForJob);}
    public void setFrame(){}


}
