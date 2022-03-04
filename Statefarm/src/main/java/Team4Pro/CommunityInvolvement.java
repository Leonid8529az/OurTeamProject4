package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityInvolvement extends OurAPI {

    public CommunityInvolvement(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Visit our newsroom')]")
    WebElement newsRoom;
    @FindBy(xpath = "//a[contains(text(),'Simple Insights')]")
    WebElement simpleInsights;
    @FindBy(xpath = "//a[contains(text(),'submit your sponsorship proposal')]")
    WebElement sponsorshipProposal;
    @FindBy(xpath = "//a[contains(text(),'State Farm Teacher Assist')]")
    WebElement teacherAssist;
    @FindBy(xpath = "//*[@title='National Community Relationships']")
    WebElement nationalCommunity;
    @FindBy(xpath = "//*[@title=\"State Farm Foundation\"]")
    WebElement foundation;
    @FindBy(xpath = "//*[@title=\"Education Assist®\"]")
    WebElement educationAssist;

    public void setNewsRoom(){click(newsRoom);}
    public void setSimpleInsights(){click(simpleInsights);}
    public void setSponsorshipProposal(){click(sponsorshipProposal);}
    public void setTeacherAssist(){click(teacherAssist);}
    public void setNationalCommunity(){click(nationalCommunity);}
    public void setFoundation(){click(foundation);}
    public void setEducationAssist(){click(educationAssist);}

}
