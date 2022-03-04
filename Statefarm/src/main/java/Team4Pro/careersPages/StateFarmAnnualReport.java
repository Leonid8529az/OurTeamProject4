package Team4Pro.careersPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StateFarmAnnualReport extends OurAPI {

    public StateFarmAnnualReport(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@title=\"2020-annual-report\"]")
    WebElement report2020;


    public void setReport2020 (){click(report2020);}
}
