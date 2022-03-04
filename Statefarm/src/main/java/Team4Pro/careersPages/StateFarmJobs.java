package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFarmJobs extends OurAPI {

    public StateFarmJobs(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "(//*[@class=' -oneX-btn-primary__anchor -oneX-btn-fit-content '])[1]")
            public
    WebElement findJobsButton;
    @FindBy(xpath = "(//*[@class=' -oneX-btn-primary__anchor -oneX-btn-fit-content '])[2]")
            public
    WebElement contactRecruiterButton;
    @FindBy(xpath = "//*[@title=\"State Farm Careers\"]")
            public
    WebElement joinOurCorporate;

    public void setFindJobsButton(){click(findJobsButton);}
    public void setContactRecruiterButton(){click(contactRecruiterButton);}
    public void setJoinOurCorporate(){}
}
