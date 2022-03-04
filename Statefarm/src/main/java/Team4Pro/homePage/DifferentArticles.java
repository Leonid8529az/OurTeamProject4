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

    @FindBy(xpath = "(//*[@class='-oneX-link--block--variant2 -oneX-link-tertiary '])[2]")
            public
    WebElement privacy;

    @FindBy(xpath = "//a[contains(text(),'Business to Business')]")
            public
    WebElement businessToBusiness;

    @FindBy(xpath = "(//*[text()='Search'])[1]")
    WebElement searchFieldButton;
    @FindBy(xpath = "//*[@id=\"util-sf-search\"]")
    WebElement searchField;
    @FindBy(xpath = "//*[@class=\"-oneX-util-search-button -oneX-btn-primary -oneX-btn-fit-content \"]")
    WebElement searchValidation;

    @FindBy(xpath = "//*[text()='Help']")
    WebElement helpButton;




    public void setCommunityInvolvement(){click(communityInvolvement);}
    public void setLearnAboutDriveSafe(){click(learnAboutDriveSafe);}
    public void setExplore100Years(){click(explore100Years);}
    public void setPrivacy(){click(privacy);}
    public void setBusinessToBusiness(){click(businessToBusiness);}
    public void setSearchFieldButton(){click(searchFieldButton);}
    public void setSearchField(String keyword){enterText(searchField,keyword);}
    public void setSearchValidation(){click(searchValidation);}
    public void setHelpButton(){click(helpButton);}


}
