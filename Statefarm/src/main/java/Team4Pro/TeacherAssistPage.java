package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeacherAssistPage extends OurAPI {
    public TeacherAssistPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='button-17514']")
    WebElement stateForTeacherAssist;

    public void setStateForTeacherAssist(){click(stateForTeacherAssist);}


}
