package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyRelationship extends OurAPI {
    public CompanyRelationship(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()=\"Learn more about American Red Cross\"]")
            public
    WebElement learnAboutAmericanRed;
    @FindBy(xpath = "//*[text()=\"Learn more about American Red Cross\"]")
            public
    WebElement learnAboutHabits;


    public void setLearnAboutAmericanRed(){click(learnAboutAmericanRed);}
    public void setLearnAboutHabits(){click(learnAboutHabits);}





}
