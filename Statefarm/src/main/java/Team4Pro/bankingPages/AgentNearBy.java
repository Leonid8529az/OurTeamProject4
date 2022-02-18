package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentNearBy extends OurAPI {
    public AgentNearBy (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[text()='Agent Website'and@title='Sammy Martinez']")
    public
    WebElement sammyMartinezWebsite;
    @FindBy(xpath = "//*[text()='Get Directions'and@title='Sammy Martinez']")
    WebElement sammyMartinezDirection;
    @FindBy(xpath = "//*[text()='Email Agent'and@title='Sammy Martinez']")
    WebElement getSammyMartinezEmail;

    public void setSammyMartinezWebsite(){click(sammyMartinezWebsite);}
    public void setSammyMartinezDirection(){click(sammyMartinezDirection);}
    public void setGetSammyMartinezEmail(){click(getSammyMartinezEmail);}
}
