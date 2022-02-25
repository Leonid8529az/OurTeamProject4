package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anniversary extends OurAPI {
    public Anniversary(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement emailFieldForStory;
    @FindBy(xpath = "//span[contains(text(),'Sign up for details here.')]")
    WebElement signUp;



    public void setEmailFieldForStory(String email){enterText(emailFieldForStory,email);}
    public void setSignUp(){click(signUp);}
}
