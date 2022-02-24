package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggingPage extends OurAPI {
    public LoggingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='username']")
    WebElement userIdToLogging;
    @FindBy(xpath = "//*[@id='password']")
    WebElement passWordToLogging;
    @FindBy(xpath = "//*[@id='troubleLoggingIn']")
    WebElement troubleLogging;


    public void setUserIdToLogging(String user){enterText(userIdToLogging,user);}
    public void setPassWordToLogging(String passWord){enterText(passWordToLogging,passWord);}
    public void setTroubleLogging(){click(troubleLogging);}
}
