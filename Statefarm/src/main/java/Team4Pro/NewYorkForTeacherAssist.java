package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.cert.X509Certificate;

public class NewYorkForTeacherAssist extends OurAPI {
    public NewYorkForTeacherAssist(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailToSubscribe;
    @FindBy(xpath = "//input[@id='submit_button-ppmail']")
    WebElement sendButtonForSubscription;

    public void setEmailToSubscribe(String email){enterText(emailToSubscribe,email);}
    public void setSendButtonForSubscription(){click(sendButtonForSubscription);}

}
