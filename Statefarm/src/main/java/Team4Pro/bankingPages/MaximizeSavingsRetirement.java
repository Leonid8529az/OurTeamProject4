package Team4Pro.otherPages;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MaximizeSavingsRetirement extends OurAPI {

    public MaximizeSavingsRetirement (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "(//*[text()='Start saving'])[1]")
    WebElement startSavingWithCDS;
    public void setStartSavingWithCDS(){click(startSavingWithCDS);}

}
