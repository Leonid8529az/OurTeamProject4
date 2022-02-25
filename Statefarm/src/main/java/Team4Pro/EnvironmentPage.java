package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnvironmentPage extends OurAPI {

    public EnvironmentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[contains(text(),'Planting Appreciation for the Environment')]")
    WebElement planningAppreciation;
    @FindBy(xpath = "//a[contains(text(),'Jennifer.young.h3kb@statefarm.com')]")
    WebElement jenniferYoungEmail;

    public void setPlanningAppreciation(){click(planningAppreciation);}
    public void setJenniferYoungEmail(){click(jenniferYoungEmail);}
}
