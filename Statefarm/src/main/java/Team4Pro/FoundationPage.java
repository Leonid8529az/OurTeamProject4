package Team4Pro;

import base.OurAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoundationPage extends OurAPI {
    public FoundationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//a[contains(text(),'National Merit Scholarship Corporation')]")
    WebElement nationalMerit;
    public void setNationalMerit(){click(nationalMerit);}

}

