package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyOverviewPage extends OurAPI {

    public CompanyOverviewPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//*[text()='Code of Conduct'])[2]")
            public
    WebElement codeOfConduct;
    @FindBy(xpath = "//*[text()='See our Annual Reports']")
    public
    WebElement annualReport;


    public void setCodeOfConduct(){click(codeOfConduct);}
    public void setAnnualReport(){click(annualReport);}
}
