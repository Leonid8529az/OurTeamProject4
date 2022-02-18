package Team4Pro.insurancePages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkersCompensation extends OurAPI {

    public WorkersCompensation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class=\"-oneX-link--block\"and text()='Learn how to lower your risks']")
    public
    WebElement learnRisks;
    public void setLearnRisks(){click(learnRisks);}

}
