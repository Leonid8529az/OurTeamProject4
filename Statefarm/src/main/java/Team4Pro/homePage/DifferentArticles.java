package Team4Pro.homePage;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentArticles extends OurAPI {

    public DifferentArticles(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[contains(text(),'Community Involvement')]")
    public
    WebElement communityInvolvement;
    @FindBy(xpath = "//a[contains(text(),'Learn more about Drive Safe & Save')]")
    public
    WebElement learnAboutDriveSafe;
    @FindBy(xpath = "//a[contains(text(),'Explore State Farm at 100 years')]")
    public
    WebElement explore100Years;


    public void setCommunityInvolvement(){click(communityInvolvement);}
    public void setLearnAboutDriveSafe(){click(learnAboutDriveSafe);}
    public void setExplore100Years(){click(explore100Years);}


}
