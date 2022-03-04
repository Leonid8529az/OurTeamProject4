package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFarmJobsSearch extends OurAPI {
    public StateFarmJobsSearch(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@class=\"mat-select-placeholder ng-tns-c61-1 ng-star-inserted\"]")
            public
    WebElement jobLocation;
    @FindBy(xpath = "//*[@id=\"mat-select-value-1\"]")
            public
    WebElement jobPosition;
    @FindBy(xpath = "(//*[text()='Apply Now'])[1]")
            public
    WebElement applyNowForJob;

    public void setJobLocation(){click(jobLocation);}
    public void setJobPosition(String position){selectDropDownOption(jobPosition,position);}
    public void setApplyNowForJob(){click(applyNowForJob);}

}
