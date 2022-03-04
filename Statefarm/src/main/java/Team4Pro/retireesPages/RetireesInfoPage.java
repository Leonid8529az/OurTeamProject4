package Team4Pro.retireesPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetireesInfoPage extends OurAPI {
    public RetireesInfoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[text()='Directory']")
            public
    WebElement directory;

    @FindBy(xpath = "//*[text()='Resources']")
            public
    WebElement resources;

    @FindBy(xpath = "//*[text()='Accolade Health Assistant']")
            public
    WebElement accoladeHelp;


    @FindBy(xpath = "//*[text()='Matching Gift']")
            public
    WebElement matchingGift;

    @FindBy(xpath = "//*[@title=\"Sign up for 100th news\"]")
    public
    WebElement signupForNews;

    @FindBy(xpath = "//*[@title='100 for Good <sup>TM</sup>']")
    public
    WebElement joinViaDesktop;



    public void setDirectory(){click(directory);}
    public void setResources(){click(resources);}
    public void setAccoladeHelp(){click(accoladeHelp);}
    public void setMatchingGift(){click(matchingGift);}
    public void setSignupForNews(){click(signupForNews);}
    public void setJoinViaDesktop(){click(joinViaDesktop);}
}
